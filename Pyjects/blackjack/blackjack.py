"""
A beginner spin on the popular game 'Blackjack' played in casinos.

Rey H. Stone
"""

import random
import sys
import time

card_values = ['A', '2', '3', '4', '5',
               '6', '7', '8', '9', '10', 'J', 'Q', 'K']

card_suits = ['Spades', 'Hearts', 'Clubs', 'Diamonds']

playing = True
player_turn = True


# initiates the card value and the suit.
class Card:
    def __init__(self, suit, value):
        self.suit = suit
        self.value = value

    def __str__(self):
        return " of ".join((self.value, self.suit))


class Deck:  # initiates the common French Deck used to play blackjack. the deck is shuffled and cards can be popped as well.
    def __init__(self):
        self.cards = [Card(s, v) for s in card_suits for v in card_values]

    def shuffle(self):
        random.shuffle(self.cards)

    def deal(self):
        return self.cards.pop()


class Hand:  # player hand and dealer hand.
    def __init__(self, dealer=False) -> None:
        self.dealer = dealer
        self.cards = []
        self.value = 0

    def add_card(self, card):
        self.cards.append(card)

    def calculate_value(self):
        self.value = 0
        has_ace = 0

        for card in self.cards:
            if card.value.isnumeric():
                self.value += int(card.value)

            else:
                if card.value == 'A':
                    has_ace += 1
                    self.value += 11
                else:
                    self.value += 10

            if self.value > 21 and has_ace > 1:
                self.value -= 10

    def get_value(self):
        self.calculate_value()
        return self.value

    # prints out the dealer's hand while taking into account the hidden card that the player cannot see.
    def hidden_display(self):

        if self.dealer:
            print("\nDealer hand:")
            print("<card hidden>", self.cards[1], sep='\n')
            print('-------')
        else:
            print("Player hand:")
            print(*self.cards, sep='\n')
            print("Score:", self.get_value())
            print('-------')

    def display(self):
        if self.dealer:
            print("\nDealer hand:")
            for card in self.cards:
                print(card)
            print("Dealer score:", self.get_value())
            print('-------')
        else:
            print("Player hand:")
            for card in self.cards:
                print(card)
            print("Player score:", self.get_value())
            print('-------')


# fake money, which is good.
class Chips:
    def __init__(self) -> None:
        self.total = 100
        self.bet = 0

    def win_bet(self):
        self.total = self.total + int(self.bet)

    def lose_bet(self):
        self.total = self.total - int(self.bet)


# player commands of blackjack


def take_bet(chips):
    while True:
        try:
            print("\nTotal chips:", chips.total)
            chips.bet = input("How many chips would you like to bet? ")

            if chips.bet.lower() in ['q', 'quit']:
                print("Thanks for playing.")
                time.sleep(3)
                sys.exit()

            else:
                chips.bet == int(chips.bet)

        except ValueError:
            print("A bet must be an integer.")

        else:
            if int(chips.bet) > chips.total:
                print("You don't have enough chips to bet", chips.bet)

            else:
                break


def hit(deck, hand):
    hand.add_card(deck.deal())
    hand.get_value()


def player_wins(player, dealer, chips):
    print("\nYou win.")
    chips.win_bet()


def player_loses(player, dealer, chips):
    print("\nYou lost.")
    chips.lose_bet()


def push(player, dealer, chips):
    print("\nIt's a push.")


class Game:  # blackjack gameplay.
    def __init__(self):
        self.player_hand = None
        self.dealer_hand = None
        self.deck = Deck()
        self.player_chips = Chips()

    def play(self):
        global playing

        while playing:
            print('Welcome to blackjack!')

            self.deck = Deck()
            self.deck.shuffle()

            self.dealer_hand = Hand(dealer=True)
            self.player_hand = Hand()

            for i in range(2):
                self.player_hand.add_card(self.deck.deal())
                self.dealer_hand.add_card((self.deck.deal()))

            take_bet(self.player_chips)

            self.dealer_hand.hidden_display()
            self.player_hand.hidden_display()

            game_over = False

            while not game_over:  # checks for blackjack.
                player_has_blackjack, dealer_has_blackjack = self.check_for_blackjack()
                if player_has_blackjack or dealer_has_blackjack:
                    game_over = True
                    self.show_results(player_has_blackjack,
                                      dealer_has_blackjack)
                    continue

                choice = input(
                    "\nWould you like to 'hit' or 'stand'? ").lower()
                while choice not in ['h', 's', 'hit', 'stand']:
                    choice = input("Please choose either 'hit' or 'stand': ")

                if choice in ['hit', 'h']:
                    hit(self.deck, self.player_hand)
                    self.dealer_hand.hidden_display()
                    self.player_hand.hidden_display()

                    if self.player_is_over():
                        self.dealer_hand.display()
                        self.player_hand.display()
                        player_loses(self.player_hand,
                                     self.dealer_hand, self.player_chips)
                        game_over = True

                elif choice in ['s', 'stand']:
                    print("Player stands. Dealer is playing.")

                    self.dealer_hand.display()
                    self.player_hand.display()

                    while self.dealer_hand.get_value() < 17:
                        hit(self.deck, self.dealer_hand)
                        self.dealer_hand.display()
                        self.player_hand.display()

                    if self.dealer_is_over():
                        player_wins(self.player_hand,
                                    self.dealer_hand, self.player_chips)
                        game_over = True

                    elif dealer_has_blackjack:
                        player_loses(self.player_hand,
                                     self.dealer_hand, self.player_chips)
                        game_over = True

                    elif self.player_hand.get_value() < self.dealer_hand.get_value():
                        player_loses(self.player_hand,
                                     self.dealer_hand, self.player_chips)
                        game_over = True

                    elif self.player_hand.get_value() > self.dealer_hand.get_value():
                        player_wins(self.player_hand,
                                    self.dealer_hand, self.player_chips)
                        game_over = True

                    elif self.dealer_hand.get_value() == self.player_hand.get_value():
                        push(self.player_hand, self.dealer_hand, self.player_chips)
                        game_over = True

            print("Final chips:", self.player_chips.total)
            print('\n-------\n')

            self.play_again()

    # post game checks
    def player_is_over(self):
        return self.player_hand.get_value() > 21

    def dealer_is_over(self):
        return self.dealer_hand.get_value() > 21

    def check_for_blackjack(self):
        player = False
        dealer = False

        if self.player_hand.get_value() == 21:
            player = True

        elif self.dealer_hand.get_value() == 21:
            dealer = True

        return player, dealer

    def show_results(self, player_has_blackjack, dealer_has_blackjack):
        if player_has_blackjack and dealer_has_blackjack:
            self.dealer_hand.display()
            self.player_hand.display()
            push(self.player_hand, self.dealer_hand, self.player_chips)

        elif player_has_blackjack:
            self.dealer_hand.display()
            self.player_hand.display()
            player_wins(self.player_hand, self.dealer_hand, self.player_chips)

        elif dealer_has_blackjack:
            self.dealer_hand.display()
            self.player_hand.display()
            player_loses(self.player_hand, self.dealer_hand, self.player_chips)

    def play_again(self):
        if self.player_chips.total > 0:
            while True:
                new_game = input("Would you like to play again? (yes/no) ")

                if new_game.lower() in ['y', 'yes']:
                    self.play()
                    continue

                elif new_game.lower() in ['n', 'no', 'q', 'quit']:
                    print("Thanks for playing!")
                    time.sleep(3)
                    sys.exit()

                else:
                    print("Unrecognised command.")
                    continue

        elif self.player_chips.total <= 0:
            print("You don't have enough chips to play again.")
            print("Thanks for playing.")
            time.sleep(3)
            sys.exit()


if __name__ == '__main__':  # initiate the game.
    g = Game()
    g.play()

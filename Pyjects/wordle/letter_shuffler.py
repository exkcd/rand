"""
Takes a user input of a five letter word and shuffles the letters to find anagrams. Based off of Wordle.

Rey H. Stone
"""

from itertools import permutations

file = open("guesses.txt", "r")


def change_word(word):

    chars = [char for char in word]  # changed word into a list of characters

    combos = list(map("".join, permutations(chars)))

    altered_list = []

    wordle_list = []

    for altered_word in combos:  # puts the permutations of the original word into a list
        altered_list.append(altered_word)

    for line in file:  # condenses all guesses from the guesses.txt into a list
        wordle_list.append(line.strip())

    # checks to make sure that the words are in both lists
    result = [word for word in wordle_list if word in altered_list]

    print(result)


searched_word = input("please type in a word: ").lower()

if len(searched_word) > 5:
    print("word is too long")

else:
    change_word(searched_word)

file.close()

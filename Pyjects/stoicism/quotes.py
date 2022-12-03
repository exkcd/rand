"""
This code takes text from an already established text document and searches through for a quote.

Rey H. Stone
"""

import random  # needs to be a random quote.

file = "quotes.txt"

num = random.randint(1, 1615)

with open(file, "r", encoding="utf-8") as f:  # utf-8 encoding just because.
    contents = f.readlines()

    while num % 4 != 0:
        # 1615 is the number of lines in said document.
        num = random.randint(1, 1615)

        if num % 4 == 0:  # since not every line is a quote, this fileters out author and book.
            counter = 0
            while counter != 3:
                print(contents[num].strip())
                counter = counter + 1
                num = num + 1

            break

        else:
            pass

    f.close()

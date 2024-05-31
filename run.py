print("********Card Busters*********")

#Player cards

player1_cards = [10, 6, 8, 9, 7, 12, 7]
player2_cards = [7, 6, 9, 5, 2, 8, 11]

player1_wins = 0
player2_wins = 0

i= 0

for num, (p1, p2) in enumerate(zip(player1_cards, player2_cards),start=1):
    print(f"Round number {num}: ", end='')
    if p1 > p2:
         print(f"Player 1 wins the round, with {p1} beating {p2}")
         player1_wins += 1
    elif p1 < p2:
         print(f"Player 2 wins the round, with {p2} beating {p1}")
         player2_wins += 1
    else:
        print("This round has ended in a draw")
        i += 1
            
if player1_wins > player2_wins:
        print("Player 1 wins the game by", player1_wins, "wins to", player2_wins)
elif p1_wins < p2_wins:
        print("Player 2 wins the game by", player2_wins, "wins to", player1_wins)

else:
    print("The game has finished in a tie")

while True:
  user1 = input("Player1 choose Rock/Paper/Scissors: ").lower()
  user2 = input("Player2 choose Rock/Paper/Scissors: ").lower()

  if user1 == user2 :
        print("Both the Players win")
  elif user1 == "rock" :
        if user2 == "scissors":
            print("user1 wins")
        else:
            print("user2 wins")
  elif user1 == "paper":
        if user2 == "rock":
           print("user1 wins")
        else:
           print("user2 wins")
  elif user1 == "scissors":
        if user2 == "paper":
           print("user1 wins")
        else:
           print("user2 wins")
  else:
        print("Players entered the invalid input,Please enter the valid input")

  repeat = input("Do you want to play another round Y/N: ").lower()
  if repeat == 'y':
        pass
  elif repeat == 'n':
        raise SystemExit
  else:
        print("You have entered a invalid input")
        raise SystemExit
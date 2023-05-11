' Initialize score to 0
Dim score
score = 0

' Loop through the rooms
Do
  ' Generate a random door number (1, 2, or 3)
  Dim g_door
  g_door = Int((3 * Rnd) + 1)

  ' Get the user's guess
  Dim user_guess
  user_guess = InputBox("Three doors ahead...\na ghost is behind one.\nWhich door do you open?\n1, 2, or 3?")

  ' Check if the user's guess is valid (between 1 and 3 inclusive)
  If Not IsNumeric(user_guess) Or user_guess < 1 Or user_guess > 3 Then
    MsgBox "Your guess must be a number and between 1 and 3 inclusive!"
    Continue Do
  End If

  ' Check if the user's guess is correct
  If user_guess = g_door Then
    MsgBox "GHOST! \nRun away!\nGame over! you scored " & score
    Exit Do
  Else
    MsgBox "No ghost!\nYou enter the next room."
    score = score + 1
  End If
Loop

' Display the final score
MsgBox "You scored " & score & " points!"

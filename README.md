# Public & Private Key Finder
This program was inspired by a handout from my Introduction to Information Security course. In class we covered how to manually find the public and private key and so I'm interested in implementing it via a computer program. Through accepting user input (2 prime numbers, p and q, and a relative coprime number) the app is able to find the public key and calculate the private key's private decrypt exponent.
Here's a screenshot of the program finding both the public and private keys when p = 5, q = 11 and the coprime is 7:
![screenshot_of_app](https://user-images.githubusercontent.com/18653175/44235978-745a7480-a179-11e8-86d6-ebfcc0036658.png)

Below is a screenshot of the handout:
![screenshot_of_handout](https://user-images.githubusercontent.com/18653175/44053996-5dae4944-9f0f-11e8-8093-c0fa662459b5.PNG)

## Update Aug 12
So far the program can complete steps 1 through 3 but I'm encountering a little difficulty with step 4. 

## Update Aug 14
I was able to complete step 4 by following the "How to Calculate a Coprime" instructions on the [Sciencing Website](https://sciencing.com/calculate-coprime-6921150.html). While jamming to some [music](https://www.youtube.com/watch?v=AftvCIiYk5c), and searching Stack Overflow for a message from the Gods, I realized that it's possible to just iterate through the ArrayList! Through doing this I successfully solved my months old issue.

## Update Aug 15
I'm so close to completling this project I can just taste it! All I need to address now is steps 6-7. I considered calculating the Private Decrypt Exponent by using the formula but that didn't get me anywhere. Tomorrow I'll try checking it against the coprimeFactorList and see what happens then! Until Then! 

## Update Aug 16
This project is now completed! I'm very proud of it! For the future I can consider implementing a GUI for this text input skeleton. In the next couple days I'm going to remove these updates and post my journey through the project unto my [website](https://kstupart.github.io/) 

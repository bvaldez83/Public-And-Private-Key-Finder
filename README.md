# Public Key Encryptor
This is currently a work in progress public key encryption app.
Here's a screenshot of what the program can do so far:
![publickey](https://user-images.githubusercontent.com/18653175/44165722-74824380-a097-11e8-9c17-0c21d921a1df.png)

This program was inspired by a handout from my Introduction to Information Security course. In class we covered how to manually find the private key and so I'm interested in implementing it via a computer program. So far the program can complete steps 1 through 3 but I'm encountering a little difficulty with step 4. 

## Update Aug 14
I was able to complete step 4 by following the "How to Calculate a Coprime" instructions on the [Sciencing Website](https://sciencing.com/calculate-coprime-6921150.html). While jamming to some [music](https://www.youtube.com/watch?v=AftvCIiYk5c), and searching Stack Overflow for a message from the Gods, I realized that it's possible to just iterate through the ArrayList! Through doing this I successfully solved my months old issue.

## Update Aug 15
I'm so close to completling this project I can just taste it! All I need to address now is steps 6-7. I considered calculating the Private Decrypt Exponent by using the formula but that didn't get me anywhere. Tomorrow I'll try checking it against the coprimeFactorList and see what happens then! Until Then! 

Below is a screenshot of the handout:
![publickey_handout](https://user-images.githubusercontent.com/18653175/44053996-5dae4944-9f0f-11e8-8093-c0fa662459b5.PNG)

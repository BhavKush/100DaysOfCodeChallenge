You are updating the username policy on your company's internal networking platform. According to the policy, a username is considered valid if all the following constraints are satisfied:

The username consists of 8 to 30 characters inclusive. If the username consists of less than 8 or greater than 30 characters, then it is an invalid username.
The username can only contain alphanumeric characters and underscores (_). Alphanumeric characters describe the character set consisting of lowercase characters [a-z], uppercase characters [A-Z], and digits[0=9] .
The first character of the username must be an alphabetic character, i.e., either lowercase character [a-z] or uppercase character [A-Z].

Explaination:- 

[a-zA-Z]{1}--> means any character(a-z) or(A-Z) can appear at first but only 1 time.

[0-9_a-zA-Z]{7-29} means any character b/w (a-z) or (A-Z) or _ or (0-9) can appear atleast 7 times and atmost 29 times which result in total of (8-30) character in our string.
Sample input :

4

Julia

Samantha

Samantha_21

1Samantha



Sample output :

 Invalid

Valid

Valid

Invalid

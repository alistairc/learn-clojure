SimplEx
=====

Write a simple text pattern matcher.

Taking two equal-length strings as input, one containing text and the other a pattern, 
return/output 'Match' if they match or 'No Match' if they don't.

The text can contain textual characters a-z/A-Z, digits 0-9, and spaces.

The pattern can contain the following:

- 't' - matches text character a-z/A-Z
- 'd' - matches a digit 0-9
- ' ' - matches a space

Examples
----------

    "Hi mum" "tt ttt" -> Match
    "Hi mum" "tttttt" -> No Match
    "abc123" "tttddd" -> Match
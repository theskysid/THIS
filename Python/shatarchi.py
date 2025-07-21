def countlettersanddigits(input_string):
    letters = 0
    digits = 0

    for char in input_string:
        if char.isdigit():
            digits += 1
        elif char.isalpha():
            letters += 1
    return letters, digits

def writecounttofile(file_name, letters, digits):
    with open(file_name, 'w') as f:
        f.write(f"Number of letters: {letters}\n")
        f.write(f"Number of digits: {digits}")



input_string = "My name is Siddhant and i am 19 years old"
file_name = "/home/theskysid/Desktop/new.txt"
letters, digits = countlettersanddigits(input_string)
writecounttofile(file_name, letters, digits)

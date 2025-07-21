def read_file_to_last(filename):
    lines = []  # Use a list to store lines
    with open(filename, 'r') as f:
        while True:
            line = f.readline()
            if not line:  # Stop when the line is empty (EOF)
                break
            lines.append(line.strip())  # Append stripped line to the list
    return lines  # Return the list of lines

filename = '/home/theskysid/Desktop/new.txt'
a = read_file_to_last(filename)
print(a)

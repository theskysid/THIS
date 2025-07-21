def sep(filename):
    with open(filename) as f:
        content = f.read();
        f.close()

    separated_content = ",".join(content)

    with open(filename, 'w') as f:
        f.write(separated_content)
        f.close()



file = "/home/theskysid/Desktop/new.txt"
# sep(file)

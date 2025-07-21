file = open('/home/theskysid/Desktop/new.txt', 'r+')
# L = ["This is Delhi\n"
#      "This is Paris\n",
#      "This is London\n"]
# file.writelines(L)
file.seek(0)
# data = file.read()
# print(data)

line = file.readlines()
print(line)

file.close()
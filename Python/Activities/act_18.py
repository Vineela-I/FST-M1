import pandas

dataframe = pandas.read_csv("Sample.csv")

print("Usernames")
print(dataframe["Usernames"])

print("2nd row username and password")
print(dataframe["Usernames"][1],dataframe["Passwords"][1])

print("Datasorted in ascending order of usernames:")
print(dataframe.sort_values('Usernames'))
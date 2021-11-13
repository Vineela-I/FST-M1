import pandas

data = {
    "Usernames":["admin","Charles","Deku"],
    "Passwords":["password","Charl3","AllMight"]
}
dataframe = pandas.DataFrame(data)
print(dataframe)
dataframe.to_csv("Sample.csv",index = False)
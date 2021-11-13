import pandas

dataframe = pandas.read_excel('Sample.xlsx')

print("No.of Rows and Columns are: ",dataframe.shape)

print("Data in Email Column: ")
print(dataframe['Email'])

print("Data after sorting based on FirstName: ")
print(dataframe.sort_values('FirstName'))
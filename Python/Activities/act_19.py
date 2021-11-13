import pandas
from pandas import ExcelWriter

data = {
    "FirstName":["Satvik","Avinash","Lahri"],
    "SecondName":["Shah","kati","Rath"],
    "Email":["satshah@example.com","avinashk@example.com","lahri.rath@example.com"],
    "PhoneNumber":["4537829158","5892184058","4528727830"]
}

dataframe = pandas.DataFrame(data)
print(dataframe)

writer = ExcelWriter('Sample.xlsx')
dataframe.to_excel(writer,'Sheet1',index=False)

writer.save()
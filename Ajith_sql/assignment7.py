import pymongo
conn="mongodb://localhost:27017/college"
client=pymongo.MongoClient(conn)
db=client["college"]
col=db["studlist"]
myquery = { "gender": { "$eq": "female"},"course": {"$eq": "MCA"}}
mydoc = col.find(myquery,{"name":1,"mark":1,"_id":0})
 
print("Name and marks of female students in MCA \nName \t\t Marks")
for x in mydoc:
    print(x["name"]["fname"]+" "+x["name"]["lname"]+"\t",x["mark"])
print("\n")

myquery2 = {"course":{"$eq":"MCA"}}
mydoc2 = col.find(myquery2,{}).sort("mark",-1)
print(mydoc2[0])
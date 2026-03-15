class Address:
    def getaddress(self):
        self.state=input("Enter your state: ")
        self.district=input("Enter your district: ")
        self.post=input("Enter your post: ")
        self.policestation=input("Enter your police Station: ")
        self.village=input("Enter your village: ")
        self.pincode=int(input("Enter your pin code: "))
        self.contact=int(input("Enter your contact number: "))
        
    def display(self):
        print ("State:",self.state)
        print ("District:",self.district)
        print ("Post:",self.post)
        print ("Police Station:",self.policestation)
        print ("Village:",self.village)
        print ("Pin Code:",self.pincode)
        print ("Contact: ",self.contact)
        
class Student(Address):
    College = "L.N.T College"
    def input(self):
        self.marks={}
        self.roll = int(input("Enter Your Roll: "))
        self.registrationyear = int(input("Enter registration/Year: "))
        self.name = input("Enter Your Name: ")
        subjects = ["Hindi", "English", "Math", "Science", "Sanskrit"]
        for subject in subjects:
            mark = float(input(f"Enter {subject} marks: "))
            self.marks.update({subject: mark}) 

    def output(self):
        print("College name:", Student.College)
        print("Roll:", self.roll)
        print("Registration:", self.registration)
        print("Name:", self.name)
        print("Marks:")
        for subject, mark in self.marks.items():
            print(f"{subject}: {mark}")

student_list = []

while True:
    s1=Student()
    s1.getaddress()
    s1.input()

    student_list.append(s1)
    y = input('Continue? (y/n): ')
    if y.lower() == 'n':
        break
# Display details of all students
for student in student_list:
    student.output()
    student.display()
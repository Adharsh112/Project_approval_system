#Assignment 2
#Manasa Chittiboyina
#0907445

import auto_grade

def DayOfTheWeek(user_input):
    if user_input == 1:
        print("Monday")
    elif user_input == 2:
	    print("Tuesday")
    elif user_input == 3:
	    print("Wednesday")
    elif user_input == 4:
	    print("Thursday")
    elif user_input == 5:
	    print("Friday")
    elif user_input == 6:
	    print("Saturday")
    elif user_input == 7:
	    print("Sunday")
    else:
	    print("Error Message: Out Of Range Values....")
    pass

def AgeClassifier(user_input):
    #TODO Question 2
    if user_input <= 0:
        print('Invalid')
    elif user_input >= 0 and user_input <= 1:
        print('infant')
    elif user_input >1 and user_input <= 13:
        print('child')
    elif user_input >13 and user_input <= 20:
        print('teenager.')
    elif user_input >20 and user_input <= 110:
        print('adult.')
    else:
        print(' Error Message: Out Of Range Values.....')
    pass

def MassWieght(user_input):
    #TODO Question 3
    if user_input <= 0:
        print('Invalid')
    elif user_input >= 0 and user_input <= 1:
        print('infant')
    elif user_input >1 and user_input <= 13:
        print('child')
    elif user_input >13 and user_input <= 20:
        print('teenager.')
    elif user_input >20 and user_input <= 110:
        print('adult.')
    else:
        print(' Error Message: Out Of Range Values.....')
    pass

if __name__ == "__main__":
    auto_grade.grade_assignment()
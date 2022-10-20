n = input("Enter the number of fruit you like to catch: ")
basket = []

num = int(n)
for x in range(num):
    print("--------------------------")
    print("O: Orange")
    print("G: Guava")
    print("A: Apple")
    print("M: Mango")
    

    fruit = input("Enter the the first letter of the fruit: ")
    
    if  fruit.upper() == "O":
        basket.append("Orange")
        print(basket)
    elif fruit.upper() == "G":
        basket.append("Guava")
        print(basket)
    elif fruit.upper() == "A":
        basket.append("Apple")
        print(basket)
    elif fruit.upper() == "M":
        basket.append("Mango")
        print(basket)
   
        
print("------------------------")  

for x in range(num):
        eat = input("Press E to eat the fruits ")      
        if eat.upper() == "E":
            basket.pop()
            print(" ")
            print(basket)
            if not basket:
                print("the basket is empty. No more fruits")

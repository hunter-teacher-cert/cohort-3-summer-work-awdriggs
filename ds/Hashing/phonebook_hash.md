** NOTE ** abandoned half way through

# Room 9 Lives 
## Patti Elfers Wygand, Adam Driggers, Christopher De Silva, Saranii Muller
# Phonebook Plan

ascii table
- A = 65
- .
- .
- .
- Z = 90
- a = 91

## Details
each last name is unique

smith --> hash function --> 05, we that as in the index some array structure
jones --> hash funciton --> 13, store at index 13

has function
some math that reduces a string to a unique number

## Super Simple Example
pretend each letter only has name
Abrahams
Brown

We just look at the first letter, % 65 
* A, ascii value 65, 65 % 65 = 0, name would be at index 0
* B, ascii value 66, 66 % 65 = 0, name would be at index 1

### Problems
Abe and Aeb presents a problem, we need a little better hash function.

string.hashcode() --> can we use this?

how specific do we need to be about what the hash function does since we don't have to code it.

### Functions we need to outline
1. add - you should be able to add new people in to the PhoneBook by lastName. This operation should be optimized to be as fast as possible.


1. find - you should be able to find a person by lastName. For example, pb.find("Smith") would return the person in the phone book with last name "Smith". Assume that last names are unique. Find should return null if the person is not in the phone book. This operation should be optimized to be as fast as possible.
1. remove - remove a person from the list based on lastName. This operation does not have to be optimized.
1. printList - this would print out an entire phone book. This operation does not have to be optimized.

### Additional questions:

Answer these in the same or an additionl file.

1. What is the runtime for add
   - Constant, O(1)
1. What is the runtime for find
   - Constant, O(1)
1. What is the runtime for remove
   - Constant, O(1)
1. What is the runtime for printList
   - Linear, O(n)

### Research Sources
- [Hash Table](https://en.wikipedia.org/wiki/Hash_table#:~:text=In%20computing%2C%20a%20hash%20table,can%20map%20keys%20to%20values.)
- 

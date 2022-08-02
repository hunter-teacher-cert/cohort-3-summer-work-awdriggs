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
- each last name is unique

## Phonebook Class
- Phonebook has an ArrayList called phonebook to store all the names
- The phonebook ArrayList contains arraylists for each letter in the alphabet
  - Ex arrayList for A names is at index 0,
  - Ex arrayList for B names is at index 1

## Functions
### add
`add` is used to add names to the phonebook
  - look at the first character of the last name to decide which list it goes into.
    - first character % 65 = sublist index
  - Add this person to that list, don't worry about the order right now

### find
you should be able to find a person by lastName. For example, pb.find("Smith") would return the person in the phone book with last name "Smith". Assume that last names are unique. Find should return null if the person is not in the phone book. This operation should be optimized to be as fast as possible.
  - merge sort the list
  - do a binary search of the list by last name
  - return the record

### remove 
remove a person from the list based on lastName. This operation does not have to be optimized.

### printList
this would print out an entire phone book. This operation does not have to be optimized.
   - Loop over all the lists
   - Print 

## Additional questions:
Answer these in the same or an additionl file.

1. What is the runtime for add
   Constant, O(1)
1. What is the runtime for find
   - merge sort: O(n * log(n))
   - binary search: O(log(n))
1. What is the runtime for remove
   - linear search: O(n)
1. What is the runtime for printList
   - O(n), since it is looping through everything. What is the runtime for printList


### Research Sources


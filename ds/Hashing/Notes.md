# Notes for Hashing Challenge

## Research
- Hash the last name as a int value?

## Ideas
- make an array for the phonebook, size 26
  - each item in the array will be an of section class, 
    - each section has an arraylist of people and a boolean value `isSorted`.
  - index 0 will be for all last names starting with A, index 1 will be for last names starting with B.
  - to calculate the index, take the int value of the first letter of the last name and subtract 65. For 'A,' code is 65, so 65 - 65 = 0. For 'Z,' code is 90, so 90 - 65 = 25.
- for `add`, just shove names into the correct section, set `isSorted` to false
- for `find` and `remove`, items need sorted for a binary search, so `ifSorted == false` call `.sort` and then set `isSorted` to true.


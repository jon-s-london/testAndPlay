def number_of_even(L: list[int])-> int:
  '''counts the number of even elements in L using recursion'''
  if len(L) == 0:
    return 0
  else:
    if L[0] % 2 == 0:
      return 1 + number_of_even(L[1:])
    else:
      return number_of_even(L[1:])


def number_of_even_iter(L: list[int])-> int:
  '''counts the number of even elements in L using iteration'''
  count = 0
  for number in L:
    if number % 2 == 0:
      count += 1
  return count

JonList = [1,2,3,4,5,6,7,8]

print('Recursive gives: ', number_of_even(JonList))
print('Iterative gives: ', number_of_even_iter(JonList))

# does nothing
# 2 lists, one is missing an element from the other. Identify the element. 
# Problem based on https://youtu.be/cdCeU8DJvPM

def find_missing(list1, list2): # Where list2 is always -1 element of list1
    list3 = [x for x in list1 if x not in list2]
    return list3[0]
    

l1 = [1]
l2 = []
missing = find_missing(l1, l2)
print(missing)
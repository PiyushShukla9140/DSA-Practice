// What is insertion Sort?
// It is sorting technique in which we put element from the unsorted part of an array into the sorted part of the array


public class Problem01 {

    public static int[] insertionSort(int arr[]) {

        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int curr = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = curr;
        }

        return arr;
    }

    public static void main(String[] args) {

        int arr[] = {3, 2, 5, 8, 9, 1};

        insertionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
1. The basic idea

Insertion Sort divides the array into two parts:

       Sorted       |       Unsorted
                    |
3                   | 2 5 8 9 1

We assume the first element is already sorted.

Then we take one element from the unsorted part and insert it into the correct position in the sorted part.

So:

3 | 2 5 8 9 1

becomes:

2 3 | 5 8 9 1

then:

2 3 5 | 8 9 1

and so on.

2. int n = arr.length
int n = arr.length;

Our array is:

3 2 5 8 9 1

So:

n = 6
3. Outer loop
for (int i = 1; i < n; i++)

Notice that we start at:

i = 1

and not 0.

Why?

Because we consider the first element:

3

to already be sorted.

So we start with the second element:

3 | 2 5 8 9 1
    ↑
    i

The values of i will be:

1
2
3
4
5

Every iteration takes one element from the unsorted section.

4. curr
int curr = arr[i];

This stores the actual value that we're currently trying to insert.

This is extremely important.

For the first iteration:

i = 1

Therefore:

curr = arr[1]
curr = 2

We now have:

3 | 2 5 8 9 1
    ↑
   curr

We're going to take 2 and insert it into the correct position.

5. prev
int prev = i - 1;

prev points to the element immediately before curr.

Since:

i = 1

we get:

prev = 0

So:

3 | 2
↑   ↑
prev curr

We compare arr[prev] with curr.

6. The while loop
while (prev >= 0 && arr[prev] > curr)

There are two conditions.

Condition 1
prev >= 0

This makes sure we don't go outside the array.

For example:

prev = -1

would mean we've gone before index 0.

So we stop.

Condition 2
arr[prev] > curr

This checks whether the previous element is larger than our current element.

For:

3 2

we have:

3 > 2

True.

So we need to move 3 to the right.

7. Shift the element
arr[prev + 1] = arr[prev];

This is the heart of Insertion Sort.

We are not swapping here.

We're shifting the larger element one position to the right.

Initially:

3 2 5 8 9 1
↑ ↑
3 2

After:

arr[prev + 1] = arr[prev];

we get:

3 3 5 8 9 1

We've created an empty logical position for 2.

But we haven't lost 2 because we stored it in:

int curr = arr[i];

That's exactly why curr needs to be a value, not an index.

8. Move prev backwards
prev--;

Previously:

prev = 0

Now:

prev = -1

The while loop stops because:

prev >= 0

is now false.

9. Put curr in its correct position

Now we have:

arr[prev + 1] = curr;

Since:

prev = -1

we get:

arr[0] = 2

The array becomes:

2 3 5 8 9 1

Now the first two elements are sorted:

2 3 | 5 8 9 1
 */
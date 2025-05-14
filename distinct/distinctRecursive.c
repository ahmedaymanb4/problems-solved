#include <stdio.h>
#include <stdlib.h>

int compare(const void *a, const void *b) {
    int x = *(int *)a;
    int y = *(int *)b;
    return (x > y) - (x < y);
}

int countDistinctRecursive(int A[], int index, int size, int count, int output[], int j) {
    if (index == size) return count;
    if (A[index] != A[index - 1]) {
        output[j] = A[index];
        count++;
        j++;
    }
    return countDistinctRecursive(A, index + 1, size, count, output, j);
}

int startRecursive(int A[], int N, int output[]) {
    if (N == 0) return 0;
    qsort(A, N, sizeof(int), compare);
    output[0] = A[0];
    return countDistinctRecursive(A, 1, N, 1, output, 1);
}

int main() {
    int N;
    printf("Enter number of elements: ");
    scanf("%d", &N);

    if (N <= 0) {
        printf("Invalid size.\n");
        return 1;
    }

    int *A = malloc(N * sizeof(int));
    int *output = malloc(N * sizeof(int));
    if (!A || !output) {
        printf("Memory allocation failed.\n");
        return 1;
    }

    printf("Enter array elements:\n");
    for (int i = 0; i < N; i++) {
        printf("A[%d] = ", i);
        scanf("%d", &A[i]);
    }

    int result = startRecursive(A, N, output);
    printf("Number of distinct values (recursive): %d\n", result);
    printf("Distinct values: ");
    for (int i = 0; i < result; i++) {
        printf("%d ", output[i]);
    }
    printf("\n");

    free(A);
    free(output);
    return 0;
}

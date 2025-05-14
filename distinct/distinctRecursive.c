#include <stdio.h>
#include <stdlib.h>

void sort(int A[], int N) {
    if (N == 1) return;

    for (int i = 0; i < N - 1; i++) {
        if (A[i] > A[i + 1]) {
            int temp = A[i];
            A[i] = A[i + 1];
            A[i + 1] = temp;
        }
    }

    sort(A, N - 1);
}

int countDistinctRecursive(int A[], int index, int size, int count, int output[], int j) {
    if (index == size) return count;
    if (A[index] != A[index - 1]) {
        output[j++] = A[index];
        count++;
    }
    return countDistinctRecursive(A, index + 1, size, count, output, j);
}

int startRecursive(int A[], int N, int output[]) {
    if (N == 0) return 0;

    sort(A, N);  // Use manual sort
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

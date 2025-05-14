#include <stdio.h>
#include <stdlib.h>

int compare(const void *a, const void *b) {
    int x = *(int *)a;
    int y = *(int *)b;
    return (x > y) - (x < y);
}

int countDistinct(int A[], int N, int output[]) {
    if (N == 0) return 0;
    qsort(A, N, sizeof(int), compare);
    int count = 1;
    output[0] = A[0];
    int j = 1;
    for (int i = 1; i < N; i++) {
        if (A[i] != A[i - 1]) {
            output[j++] = A[i];
            count++;
        }
    }
    return count;
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

    int result = countDistinct(A, N, output);
    printf("Number of distinct values: %d\n", result);
    printf("Distinct values: ");
    for (int i = 0; i < result; i++) {
        printf("%d ", output[i]);
    }
    printf("\n");

    free(A);
    free(output);
    return 0;
}

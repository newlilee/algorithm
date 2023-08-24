#include <stdio.h>

#define MAX_LINE 1000

int getOneLine(char line[], int maxLine);

void copy(char to[], char from[]);

int max;

int main() {
    int len;
    extern int max;
    char line[MAX_LINE];
    char longest[MAX_LINE];
    max = 0;
    while ((len = getOneLine(line, MAX_LINE)) > 0) {
        if (len > max) {
            max = len;
            copy(longest, line);
        }
    }
    if (max > 0) {
        printf("%s", longest);
    }
    return 0;
}

int getOneLine(char line[], int maxLine) {
    int c, i;
    for (i = 0; i < maxLine - 1 && (c = getchar()) != EOF && c != '\n'; ++i) {
        line[i] = c;
    }
    if (c == '\n') {
        line[i] = c;
        ++i;
    }
    line[i] = '\0';
    return i;
}

void copy(char to[], char from[]) {
    int i;
    while ((to[i] = from[i]) != '\0') {
        ++i;
    }
}
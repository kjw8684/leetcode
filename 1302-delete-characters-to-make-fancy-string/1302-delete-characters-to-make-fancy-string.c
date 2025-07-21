char* makeFancyString(char* s) {
    int len = strlen(s);
    char* result = (char*)malloc(len + 1);
    int writeIdx = 1;
    int count = 1;

    result[0] = s[0];

    for (int i = 1; s[i] != '\0'; i++) {
        if (s[i] == s[i - 1]) {
            count++;
        } else {
            count = 1;
        }

        if (count <= 2) {
            result[writeIdx++] = s[i];
        }
    }

    result[writeIdx] = '\0';
    return result;
}
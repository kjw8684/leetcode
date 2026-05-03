bool same(char*, char*);
void move(char*);

bool rotateString(char* s, char* goal) {
    int len = strlen(s);
    if(len != strlen(goal)) {
        return false;
    }

    for(int i = 0; i < len; i++) {
        move(s);
        if(same(s, goal)) {
            return true;
        }
    }

    return false;
}

bool same(char* s1, char* s2) {
    int len = strlen(s1);

    for(int i = 0; i < len; i++) {
        if(s1[i] != s2[i]) {
            return false;
        }
    }

    return true;
}

void move(char* s) {
    int len = strlen(s);
    char first = s[0];

    for(int i = 1; i < len; i++) {
        s[i - 1] = s[i];
    }
    s[len - 1] = first;
}
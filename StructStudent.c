#include <stdio.h>

struct student
{
    char name[30];
    int maths;
    int sci;
    int eng;
    struct student *next;//self referntial structure

};

int main()
{

    struct student s[5]; //

    struct student *p;
    // student => 10
    // 11 ?
    // realloc
    //[                                                            ]
    //[                     ]  [                       ]  [                           ] [                            ]

    p = malloc(sizeof(struct student));//3000
    printf("enter name and marks of three subjects");
    scanf("%s%d%d%d", &p->name, &p->maths, &p->sci, &p->eng);

    p = malloc(sizeof(struct student));//4000
    printf("enter name and marks of three subjects");
    scanf("%s%d%d%d", &p->name, &p->maths, &p->sci, &p->eng);

    p = malloc(sizeof(struct student));//5000
    printf("enter name and marks of three subjects");
    scanf("%s%d%d%d", &p->name, &p->maths, &p->sci, &p->eng);

    p = malloc(sizeof(struct student));//6000
    printf("enter name and marks of three subjects");
    scanf("%s%d%d%d", &p->name, &p->maths, &p->sci, &p->eng);

    //p-> 6000

}
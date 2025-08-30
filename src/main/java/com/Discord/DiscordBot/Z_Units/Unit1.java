package com.Discord.DiscordBot.Z_Units;

import com.Discord.DiscordBot.Units.Question;

import java.util.ArrayList;

import static com.Discord.DiscordBot.Units.QuestionBank.unit1Questions;

public class Unit1 {

    public static int numUnit1Questions;

    // Replace unit4Questions with unit1Questions.add
    public static void initializeUnit1Questions() {
        unit1Questions.add(new Question(
                "Which of the following is a polynomial function?",
                "f(x) = 3/x + 2", "f(x) = 5x^3 - 2x + 7", "f(x) = sqrt(x) + 1", "f(x) = 2^x",
                "B", 1, 0, "easy"));

// Q1
        unit1Questions.add(new Question(
                "What is the degree of the polynomial f(x) = 6x^4 - 2x^2 + x - 5?",
                "1", "2", "4", "5",
                "C", 1, 1, "easy"));

// Q2
        unit1Questions.add(new Question(
                "Which of the following is NOT a polynomial function?",
                "f(x) = x^3 - 7x + 1", "f(x) = 4x^2 + 3x - 5", "f(x) = 2/x + 1", "f(x) = -x^5 + 9",
                "C", 1, 2, "easy"));

// Q3
        unit1Questions.add(new Question(
                "The leading coefficient of f(x) = -7x^5 + 2x^3 - 4 is:",
                "-7", "2", "5", "-4",
                "A", 1, 3, "easy"));

// Q4
        unit1Questions.add(new Question(
                "What is the end behavior of f(x) = -3x^6 + 2x^4?",
                "Both ends up", "Both ends down", "Left down, right up", "Left up, right down",
                "B", 1, 4, "medium"));

// Q5
        unit1Questions.add(new Question(
                "How many x-intercepts can a 4th degree polynomial have at most?",
                "1", "2", "3", "4",
                "D", 1, 5, "easy"));

// Q6
        unit1Questions.add(new Question(
                "What is the end behavior of f(x) = 5x^3 - 2x + 1?",
                "Both ends up", "Both ends down", "Left down, right up", "Left up, right down",
                "C", 1, 6, "medium"));

// Q7
        unit1Questions.add(new Question(
                "Which of the following functions is rational but not polynomial?",
                "f(x) = x^2 - 1", "f(x) = 1/x", "f(x) = 3x^4", "f(x) = -x^5 + 2",
                "B", 1, 7, "easy"));

// Q8
        unit1Questions.add(new Question(
                "If f(x) = (x^2 - 9)/(x - 3), what is the simplified form for x ≠ 3?",
                "f(x) = x + 3", "f(x) = x - 3", "f(x) = x^2 - 3", "f(x) = 1",
                "A", 1, 8, "medium"));

// Q9
        unit1Questions.add(new Question(
                "The vertical asymptote of f(x) = (2x + 1)/(x - 4) is:",
                "x = 2", "x = -1", "x = 4", "x = 0",
                "C", 1, 9, "medium"));

// Q10
        unit1Questions.add(new Question(
                "Which of the following is the end behavior of f(x) = (3x^2 + 5)/(x^2 - 1)?",
                "y = 0", "y = 3", "y = 1", "y = -1",
                "B", 1, 10, "hard"));

// Q11
        unit1Questions.add(new Question(
                "How many turning points can a degree 5 polynomial have at most?",
                "3", "4", "5", "6",
                "B", 1, 11, "medium"));

// Q12
        unit1Questions.add(new Question(
                "The graph of f(x) = (x + 2)(x - 1)(x - 4) has how many real zeros?",
                "1", "2", "3", "4",
                "C", 1, 12, "easy"));

// Q13
        unit1Questions.add(new Question(
                "Which describes the horizontal asymptote of f(x) = (x^2 + 3)/(2x^2 - 5)?",
                "y = 0", "y = 2", "y = 1/2", "No asymptote",
                "C", 1, 13, "hard"));

// Q14
        unit1Questions.add(new Question(
                "The domain of f(x) = (x^2 - 1)/(x^2 - 9) excludes which values?",
                "x = ±1", "x = ±3", "x = 0", "x = 9",
                "B", 1, 14, "medium"));

// Q15
        unit1Questions.add(new Question(
                "If f(x) = -2x^4 + x^2 - 7, the end behavior is:",
                "Both ends up", "Both ends down", "Left down, right up", "Left up, right down",
                "B", 1, 15, "easy"));

// Q16
        unit1Questions.add(new Question(
                "A polynomial of degree 3 with real coefficients must have:",
                "Exactly 3 real zeros", "At least 1 real zero", "No real zeros", "At most 2 real zeros",
                "B", 1, 16, "medium"));

// Q17
        unit1Questions.add(new Question(
                "The slant asymptote of f(x) = (x^2 + 1)/(x - 2) is:",
                "y = x + 2", "y = x + 2 + 5/(x-2)", "y = x + 2", "y = x + 2 + remainder",
                "A", 1, 17, "hard"));

// Q18
        unit1Questions.add(new Question(
                "Which polynomial has a repeated root?",
                "f(x) = x^2 - 4", "f(x) = (x - 3)^2", "f(x) = x^3 - x", "f(x) = x^2 + 1",
                "B", 1, 18, "medium"));

// Q19
        unit1Questions.add(new Question(
                "The rational function f(x) = (x^2 - 16)/(x - 4) has a hole at:",
                "x = -4", "x = 0", "x = 4", "x = 16",
                "C", 1, 19, "hard"));

        // Unit 1 - Polynomial and Rational Functions (continued)

// Q20
        unit1Questions.add(new Question(
                "What is the degree of f(x) = (x - 2)(x + 3)(x - 5)(x + 1)?",
                "2", "3", "4", "5",
                "C", 1, 20, "easy"));

// Q21
        unit1Questions.add(new Question(
                "If f(x) = x^3 - 4x^2 + 4x, what are its zeros?",
                "0, 2, 2", "0, -2, 2", "0, 1, 4", "0, 2, -4",
                "A", 1, 21, "medium"));

// Q22
        unit1Questions.add(new Question(
                "The multiplicity of zero x = -1 in f(x) = (x + 1)^3(x - 2) is:",
                "1", "2", "3", "4",
                "C", 1, 22, "easy"));

// Q23
        unit1Questions.add(new Question(
                "Which describes the graph at x = -1 for f(x) = (x + 1)^2(x - 3)?",
                "Crosses the x-axis", "Touches and turns", "Has vertical asymptote", "Has hole",
                "B", 1, 23, "medium"));

// Q24
        unit1Questions.add(new Question(
                "The end behavior of f(x) = -x^7 + 5x^2 is:",
                "Both ends up", "Both ends down", "Left up, right down", "Left down, right up",
                "C", 1, 24, "medium"));

// Q25
        unit1Questions.add(new Question(
                "What is the horizontal asymptote of f(x) = (2x^3 - 5)/(5x^3 + 4)?",
                "y = 0", "y = 2", "y = 2/5", "y = 5/2",
                "C", 1, 25, "hard"));

// Q26
        unit1Questions.add(new Question(
                "If f(x) = (x^2 - 4)/(x - 2), what is the simplified form for x ≠ 2?",
                "x + 2", "x - 2", "x^2 - 2", "1",
                "A", 1, 26, "easy"));

// Q27
        unit1Questions.add(new Question(
                "Which best describes the domain of f(x) = (x^2 + 1)/(x^2 - 9)?",
                "All real numbers", "All reals except ±3", "All reals except 0", "All reals except ±1",
                "B", 1, 27, "medium"));

// Q28
        unit1Questions.add(new Question(
                "How many turning points can a degree 6 polynomial have at most?",
                "4", "5", "6", "7",
                "B", 1, 28, "easy"));

// Q29
        unit1Questions.add(new Question(
                "The rational function f(x) = (x^3 + 2x)/(x^2 - 1) has vertical asymptotes at:",
                "x = ±1", "x = 0", "x = 2", "x = -2",
                "A", 1, 29, "hard"));

// Q30
        unit1Questions.add(new Question(
                "Which polynomial has degree 0?",
                "f(x) = 7", "f(x) = x - 7", "f(x) = x^2", "f(x) = -x^3",
                "A", 1, 30, "easy"));

// Q31
        unit1Questions.add(new Question(
                "Which is the slant asymptote of f(x) = (x^2 + 2x + 3)/(x + 1)?",
                "y = x + 1", "y = x + 2", "y = x + 3", "y = x",
                "B", 1, 31, "hard"));

// Q32
        unit1Questions.add(new Question(
                "What is the leading term of f(x) = (2x - 3)(x + 4)(-x)?",
                "-2x^3", "2x^3", "-2x^2", "2x^2",
                "A", 1, 32, "medium"));

// Q33
        unit1Questions.add(new Question(
                "If a polynomial has odd degree and a positive leading coefficient, its end behavior is:",
                "Both ends up", "Both ends down", "Left down, right up", "Left up, right down",
                "C", 1, 33, "medium"));

// Q34
        unit1Questions.add(new Question(
                "The y-intercept of f(x) = x^3 - 2x + 5 is:",
                "5", "-2", "0", "3",
                "A", 1, 34, "easy"));

// Q35
        unit1Questions.add(new Question(
                "What is the domain of f(x) = (x + 1)/(x^2 - 4)?",
                "All reals", "All reals except ±2", "All reals except -1", "All reals except 0",
                "B", 1, 35, "medium"));

// Q36
        unit1Questions.add(new Question(
                "If f(x) = (x^2 - 1)/(x - 1), then f(x) has a hole at:",
                "x = -1", "x = 0", "x = 1", "x = 2",
                "C", 1, 36, "hard"));

// Q37
        unit1Questions.add(new Question(
                "Which function has no horizontal asymptote?",
                "f(x) = (x^3 + 1)/(x^2 + 1)", "f(x) = (2x^2 - 1)/(x^2 + 3)", "f(x) = (3x + 2)/(2x + 5)", "f(x) = 1/x",
                "A", 1, 37, "hard"));

// Q38
        unit1Questions.add(new Question(
                "Which is true about a polynomial of even degree?",
                "End behavior is opposite", "It always crosses the x-axis", "Both ends go the same direction", "It has no y-intercept",
                "C", 1, 38, "easy"));

// Q39
        unit1Questions.add(new Question(
                "What is the degree of f(x) = (x^2 - 1)(x^3 + 2)?",
                "3", "4", "5", "6",
                "C", 1, 39, "medium"));

        unit1Questions.add(new Question(
                "Which of the following is a cubic polynomial?",
                "f(x) = 2x^2 - 5", "f(x) = x^3 + 4x - 1", "f(x) = 7/x", "f(x) = sqrt(x)",
                "B", 1, 40, "easy"));

// Q41
        unit1Questions.add(new Question(
                "What is the degree of f(x) = (x - 1)^2(x + 3)^4?",
                "2", "4", "6", "8",
                "C", 1, 41, "medium"));

// Q42
        unit1Questions.add(new Question(
                "Which describes the behavior of f(x) = (x - 2)^4 at x = 2?",
                "Crosses the x-axis", "Touches and turns", "Vertical asymptote", "Hole in the graph",
                "B", 1, 42, "easy"));

// Q43
        unit1Questions.add(new Question(
                "What is the constant term of f(x) = (x - 2)(x + 1)(x - 3)?",
                "6", "-6", "12", "-12",
                "B", 1, 43, "medium"));

// Q44
        unit1Questions.add(new Question(
                "Which polynomial has degree 5?",
                "f(x) = (x - 1)(x + 2)(x^2 + 3)", "f(x) = (x^2 + 1)(x^3 - 2)", "f(x) = (x + 1)^4", "f(x) = x^2(x - 3)^2",
                "B", 1, 44, "easy"));

// Q45
        unit1Questions.add(new Question(
                "The graph of f(x) = (x - 1)(x - 2)(x - 3) crosses the x-axis at how many points?",
                "1", "2", "3", "4",
                "C", 1, 45, "easy"));

// Q46
        unit1Questions.add(new Question(
                "Which is the vertical asymptote of f(x) = (x^2 + 1)/(x^2 - 4)?",
                "x = ±1", "x = ±2", "x = 0", "x = -4",
                "B", 1, 46, "medium"));

// Q47
        unit1Questions.add(new Question(
                "What is the end behavior of f(x) = -4x^8 + 7?",
                "Both ends up", "Both ends down", "Left down, right up", "Left up, right down",
                "B", 1, 47, "easy"));

// Q48
        unit1Questions.add(new Question(
                "How many turning points can f(x) = x^4 - 3x^2 + 2 have at most?",
                "2", "3", "4", "5",
                "B", 1, 48, "medium"));

// Q49
        unit1Questions.add(new Question(
                "The rational function f(x) = (2x^2 + 3x)/(x - 1) has a hole at:",
                "x = 0", "x = -3/2", "x = 1", "None",
                "D", 1, 49, "hard"));

// Q50
        unit1Questions.add(new Question(
                "Which describes the horizontal asymptote of f(x) = (5x^4 + 1)/(2x^4 - 7)?",
                "y = 0", "y = 5/2", "y = 2/5", "No asymptote",
                "B", 1, 50, "hard"));

// Q51
        unit1Questions.add(new Question(
                "The y-intercept of f(x) = (x^2 - 1)/(x - 3) is:",
                "-1/3", "1/3", "1", "-1",
                "A", 1, 51, "medium"));

// Q52
        unit1Questions.add(new Question(
                "If f(x) = (x^2 - 9)/(x - 3), what type of discontinuity occurs at x = 3?",
                "Vertical asymptote", "Removable hole", "Jump discontinuity", "None",
                "B", 1, 52, "medium"));

// Q53
        unit1Questions.add(new Question(
                "Which function is NOT rational?",
                "f(x) = (x + 1)/(x^2 + 3)", "f(x) = (2x^2 - 1)/x", "f(x) = sqrt(x)", "f(x) = 5/(x - 4)",
                "C", 1, 53, "easy"));

// Q54
        unit1Questions.add(new Question(
                "What is the degree of f(x) = (x^2 + 1)(x^3 + 2x + 5)(x - 7)?",
                "5", "6", "7", "8",
                "C", 1, 54, "hard"));

// Q55
        unit1Questions.add(new Question(
                "If f(x) = (x + 1)(x - 1)(x - 2), what is the sum of the zeros?",
                "1", "2", "3", "4",
                "C", 1, 55, "medium"));

// Q56
        unit1Questions.add(new Question(
                "What is the multiplicity of zero x = 4 in f(x) = (x - 4)^5?",
                "1", "4", "5", "10",
                "C", 1, 56, "easy"));

// Q57
        unit1Questions.add(new Question(
                "Which describes the slant asymptote of f(x) = (x^2 + 3x + 2)/(x + 1)?",
                "y = x + 2", "y = x + 3", "y = x", "y = 0",
                "A", 1, 57, "hard"));

// Q58
        unit1Questions.add(new Question(
                "The rational function f(x) = (x^2 - 25)/(x - 5) has:",
                "Hole at x = 5", "Vertical asymptote at x = 5", "Horizontal asymptote y = 1", "Slant asymptote y = x",
                "A", 1, 58, "medium"));

// Q59
        unit1Questions.add(new Question(
                "Which statement about rational functions is true?",
                "Degree numerator < denominator → horizontal asymptote y=0",
                "Degree numerator > denominator → horizontal asymptote y=0",
                "Denominator never affects the domain",
                "All rational functions have slant asymptotes",
                "A", 1, 59, "hard"));

        unit1Questions.add(new Question(
                "Which function has an odd degree?",
                "f(x) = x^2 + 4", "f(x) = x^3 - x", "f(x) = x^4 - 2x^2", "f(x) = x^6 + 1",
                "B", 1, 60, "easy"));

        unit1Questions.add(new Question(
                "If f(x) = (x - 2)(x + 2)(x - 3), what is the product of its zeros?",
                "-12", "12", "-6", "6",
                "A", 1, 61, "medium"));

        unit1Questions.add(new Question(
                "Which describes the end behavior of f(x) = 7x^5 - 3x^2?",
                "Both ends up", "Both ends down", "Left down, right up", "Left up, right down",
                "C", 1, 62, "medium"));

        unit1Questions.add(new Question(
                "What is the leading term of f(x) = (2x - 1)(x + 4)(-x^2)?",
                "-2x^4", "2x^4", "-2x^3", "2x^3",
                "A", 1, 63, "hard"));

        unit1Questions.add(new Question(
                "Which rational function has a horizontal asymptote y = 0?",
                "f(x) = (x^3 + 1)/(2x^5)", "f(x) = (2x^2 + 1)/(x^2 + 4)", "f(x) = (3x^4 - 1)/(x^4 + 2)", "f(x) = (x^2 + 1)/(x + 1)",
                "A", 1, 64, "medium"));

        unit1Questions.add(new Question(
                "What is the y-intercept of f(x) = (x^2 - 4)/(x + 2)?",
                "-2", "-1", "0", "2",
                "B", 1, 65, "medium"));

        unit1Questions.add(new Question(
                "If a polynomial has a zero with odd multiplicity, the graph at that zero will:",
                "Cross the x-axis", "Touch and turn", "Have a vertical asymptote", "Have a hole",
                "A", 1, 66, "easy"));

        unit1Questions.add(new Question(
                "Which is the degree of f(x) = (x^3 + 2)(x^2 - 5)(x + 1)?",
                "5", "6", "7", "8",
                "C", 1, 67, "medium"));

        unit1Questions.add(new Question(
                "What is the constant term of f(x) = (x - 1)(x - 2)(x - 3)(x - 4)?",
                "24", "-24", "12", "-12",
                "A", 1, 68, "hard"));

        unit1Questions.add(new Question(
                "The rational function f(x) = (x^2 + 1)/(x^2 - 9) has vertical asymptotes at:",
                "x = ±1", "x = ±3", "x = 0", "x = ±9",
                "B", 1, 69, "medium"));

        unit1Questions.add(new Question(
                "Which polynomial has a double root at x = -2?",
                "f(x) = (x + 2)", "f(x) = (x + 2)^2", "f(x) = (x - 2)^2", "f(x) = (x^2 + 2)",
                "B", 1, 70, "easy"));

        unit1Questions.add(new Question(
                "The graph of f(x) = -2x^4 + 3x^2 - 1 has end behavior:",
                "Both ends up", "Both ends down", "Left up, right down", "Left down, right up",
                "B", 1, 71, "medium"));

        unit1Questions.add(new Question(
                "Which describes the slant asymptote of f(x) = (x^2 - 1)/(x + 2)?",
                "y = x - 2", "y = x + 2", "y = x - 2 with remainder", "y = x",
                "D", 1, 72, "hard"));

        unit1Questions.add(new Question(
                "What is the maximum number of turning points of a degree 7 polynomial?",
                "6", "7", "8", "5",
                "A", 1, 73, "easy"));

        unit1Questions.add(new Question(
                "If f(x) = (x - 4)(x + 1)(x + 3), what is the sum of the zeros?",
                "0", "2", "-2", "-6",
                "C", 1, 74, "medium"));

        unit1Questions.add(new Question(
                "Which rational function has no horizontal asymptote?",
                "f(x) = (x^3 + 1)/(x^2 + 1)", "f(x) = (2x^2 + 1)/(x^2 + 1)", "f(x) = (3x + 1)/(2x + 5)", "f(x) = 1/x",
                "A", 1, 75, "hard"));

        unit1Questions.add(new Question(
                "What is the degree of f(x) = (x^2 + 1)(x^2 - 1)(x - 5)?",
                "4", "5", "6", "7",
                "C", 1, 76, "medium"));

        unit1Questions.add(new Question(
                "If f(x) = (x^2 - 16)/(x + 4), what is the simplified form for x ≠ -4?",
                "x + 4", "x - 4", "x^2 - 4", "x + 2",
                "B", 1, 77, "easy"));

        unit1Questions.add(new Question(
                "Which describes the horizontal asymptote of f(x) = (4x^3 + 2)/(2x^3 - 5)?",
                "y = 0", "y = 2", "y = 1/2", "y = -2",
                "B", 1, 78, "hard"));

        unit1Questions.add(new Question(
                "What is the y-intercept of f(x) = (x^3 - 2x)/(x - 1)?",
                "0", "1", "-2", "2",
                "A", 1, 79, "medium"));

        unit1Questions.add(new Question(
                "Which function has an even degree and positive leading coefficient?",
                "f(x) = -x^4 + 3x^2", "f(x) = x^4 - 2x + 1", "f(x) = -x^3 + x", "f(x) = x^5 + 2",
                "B", 1, 80, "easy"));

        unit1Questions.add(new Question(
                "If f(x) = (x - 1)^3(x + 2), what is the multiplicity of x = 1?",
                "1", "2", "3", "4",
                "C", 1, 81, "medium"));

        unit1Questions.add(new Question(
                "Which polynomial has a triple root at x = 0?",
                "f(x) = x^2", "f(x) = x^3", "f(x) = x^4", "f(x) = x^5",
                "B", 1, 82, "easy"));

        unit1Questions.add(new Question(
                "The vertical asymptotes of f(x) = (x^2 - 1)/(x^2 - 4x + 3) occur at:",
                "x = 1, 3", "x = -1, 1", "x = 2, 3", "x = -3, 1",
                "A", 1, 83, "medium"));

        unit1Questions.add(new Question(
                "What is the end behavior of f(x) = 3x^6 - 5x^2 + 2?",
                "Both ends up", "Both ends down", "Left down, right up", "Left up, right down",
                "A", 1, 84, "easy"));

        unit1Questions.add(new Question(
                "If f(x) = (x^2 - 4)/(x + 2), then f(x) has a hole at:",
                "x = 2", "x = -2", "x = 4", "x = 0",
                "B", 1, 85, "medium"));

        unit1Questions.add(new Question(
                "Which polynomial has degree 0?",
                "f(x) = 7", "f(x) = x", "f(x) = x^2 + 3", "f(x) = x^3 - 1",
                "A", 1, 86, "easy"));

        unit1Questions.add(new Question(
                "What is the leading coefficient of f(x) = -2x^5 + 3x^3 - x + 7?",
                "-2", "3", "-1", "7",
                "A", 1, 87, "easy"));

        unit1Questions.add(new Question(
                "If f(x) = (x - 1)(x + 3)(x - 2), what is the sum of the zeros?",
                "0", "2", "4", "6",
                "B", 1, 88, "medium"));

        unit1Questions.add(new Question(
                "Which rational function has a slant asymptote?",
                "f(x) = (x^2 + 1)/(x + 1)", "f(x) = (2x + 3)/(x^2 - 1)", "f(x) = 1/(x - 2)", "f(x) = (x^2 - 4)/(x^2 + 1)",
                "A", 1, 89, "hard"));

        unit1Questions.add(new Question(
                "The horizontal asymptote of f(x) = (3x^2 + 1)/(6x^2 - 5) is:",
                "y = 0", "y = 1/2", "y = 3", "y = 6",
                "B", 1, 90, "medium"));

        unit1Questions.add(new Question(
                "If f(x) = x^3 - 3x^2 + x - 1, how many turning points can the graph have at most?",
                "2", "3", "1", "0",
                "A", 1, 91, "medium"));

        unit1Questions.add(new Question(
                "Which polynomial has a repeated zero at x = 2?",
                "f(x) = x^2 - 4", "f(x) = (x - 2)^2(x + 1)", "f(x) = (x - 1)(x - 2)", "f(x) = x^3 - 2x",
                "B", 1, 92, "easy"));

        unit1Questions.add(new Question(
                "The graph of f(x) = -x^4 + 2x^2 - 3 opens:",
                "Upward", "Downward", "Left", "Right",
                "B", 1, 93, "easy"));

        unit1Questions.add(new Question(
                "Which is the domain of f(x) = (x^2 - 1)/(x^2 - 4)?",
                "All real numbers", "All reals except ±2", "All reals except ±1", "All reals except 0",
                "B", 1, 94, "medium"));

        unit1Questions.add(new Question(
                "If f(x) = (x^2 - 9)/(x - 3), what is f(3)?",
                "0", "3", "6", "Undefined",
                "D", 1, 95, "medium"));

        unit1Questions.add(new Question(
                "Which polynomial has the zeros -2, 1, 1?",
                "f(x) = (x + 2)(x - 1)^2", "f(x) = (x + 2)(x - 1)", "f(x) = (x + 2)^2(x - 1)", "f(x) = (x - 2)(x - 1)^2",
                "A", 1, 96, "medium"));

        unit1Questions.add(new Question(
                "The end behavior of f(x) = -5x^7 + 2x^3 is:",
                "Both ends up", "Both ends down", "Left down, right up", "Left up, right down",
                "C", 1, 97, "medium"));

        unit1Questions.add(new Question(
                "Which function is NOT a polynomial?",
                "f(x) = x^5 - 2x + 1", "f(x) = 3x^3 + x^2 - 7", "f(x) = sqrt(x) + 2", "f(x) = -x^4 + 3",
                "C", 1, 98, "easy"));

        unit1Questions.add(new Question(
                "What is the simplified form of f(x) = (x^2 - 16)/(x - 4) for x ≠ 4?",
                "x + 4", "x - 4", "x^2 - 4", "4",
                "A", 1, 99, "medium"));



        numUnit1Questions = unit1Questions.size();
        System.out.println(String.format("There are %d questions in unit 1", numUnit1Questions));
    }

}
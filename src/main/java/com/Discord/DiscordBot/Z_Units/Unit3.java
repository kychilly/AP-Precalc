package com.Discord.DiscordBot.Z_Units;

import com.Discord.DiscordBot.Units.Question;

import static com.Discord.DiscordBot.Units.QuestionBank.unit3Questions;

public class Unit3 {

    public static int numUnit3Questions;

    public static void initializeUnit3Questions() {

        unit3Questions.add(new Question(
                "What is the period of f(x) = sin(x)?",
                "π", "2π", "π/2", "4π",
                "B", 3, 2000, "easy"));

        unit3Questions.add(new Question(
                "The amplitude of f(x) = -3cos(x) is:",
                "3", "-3", "1", "0",
                "A", 3, 2001, "easy"));

        unit3Questions.add(new Question(
                "Which is the exact value of sin(π/6)?",
                "1/2", "√2/2", "√3/2", "1",
                "A", 3, 2002, "easy"));

        unit3Questions.add(new Question(
                "Which is the exact value of cos(π/4)?",
                "1/2", "√2/2", "√3/2", "0",
                "B", 3, 2003, "easy"));

        unit3Questions.add(new Question(
                "What is the period of f(x) = tan(x)?",
                "π", "2π", "π/2", "4π",
                "A", 3, 2004, "easy"));

        unit3Questions.add(new Question(
                "If f(x) = 2sin(x) + 1, what is its amplitude?",
                "1", "2", "3", "0",
                "B", 3, 2005, "easy"));

        unit3Questions.add(new Question(
                "Which function has a vertical asymptote at x = π/2?",
                "sin(x)", "cos(x)", "tan(x)", "csc(x)",
                "C", 3, 2006, "medium"));

        unit3Questions.add(new Question(
                "What is the exact value of tan(π/3)?",
                "√3", "1/√3", "1", "0",
                "A", 3, 2007, "medium"));

        unit3Questions.add(new Question(
                "The graph of y = cos(x) is shifted π/2 units to the right. What is the new function?",
                "y = cos(x - π/2)", "y = cos(x + π/2)", "y = sin(x)", "y = -sin(x)",
                "B", 3, 2008, "medium"));

        unit3Questions.add(new Question(
                "Which of the following is equivalent to sin^2(x) + cos^2(x)?",
                "0", "1", "sin(x)cos(x)", "tan(x)",
                "B", 3, 2009, "easy"));

        unit3Questions.add(new Question(
                "What is the exact value of csc(π/2)?",
                "0", "1", "2", "Undefined",
                "B", 3, 2010, "easy"));

        unit3Questions.add(new Question(
                "Which is the polar form of the complex number z = 1 + i?",
                "r = √2, θ = π/4", "r = 1, θ = π/2", "r = √2, θ = π/2", "r = 1, θ = π/4",
                "A", 3, 2011, "medium"));

        unit3Questions.add(new Question(
                "Convert 150° to radians:",
                "5π/6", "2π/3", "3π/4", "π/3",
                "A", 3, 2012, "easy"));

        unit3Questions.add(new Question(
                "Which identity is correct?",
                "tan^2(x) + 1 = sec^2(x)", "cot^2(x) + 1 = csc(x)", "sin^2(x) + cos(x) = 1", "sec^2(x) - tan(x) = 1",
                "A", 3, 2013, "medium"));

        unit3Questions.add(new Question(
                "What is the exact value of cos(2π/3)?",
                "-1/2", "1/2", "-√3/2", "√3/2",
                "A", 3, 2014, "medium"));

        unit3Questions.add(new Question(
                "Which function is undefined at x = 0?",
                "sin(x)", "cos(x)", "tan(x)", "csc(x)",
                "D", 3, 2015, "medium"));

        unit3Questions.add(new Question(
                "Simplify tan(x) * cot(x):",
                "tan^2(x)", "1", "0", "cot^2(x)",
                "B", 3, 2016, "easy"));

        unit3Questions.add(new Question(
                "The polar coordinates (r, θ) = (2, 3π/2) correspond to which Cartesian coordinates?",
                "(0, -2)", "(0, 2)", "(-2, 0)", "(2, 0)",
                "A", 3, 2017, "medium"));

        unit3Questions.add(new Question(
                "Which equation represents a sinusoidal function with amplitude 4 and vertical shift 2?",
                "y = 4sin(x)", "y = 4sin(x) + 2", "y = 2sin(x) + 4", "y = 4cos(x - 2)",
                "B", 3, 2018, "easy"));

        unit3Questions.add(new Question(
                "If r = 3cos(θ) in polar form, what is the shape of the graph?",
                "Circle", "Line", "Parabola", "Ellipse",
                "A", 3, 2019, "medium"));

        unit3Questions.add(new Question(
                "Which is the exact value of sin(2π/3)?",
                "√3/2", "1/2", "-√3/2", "-1/2",
                "A", 3, 2020, "medium"));

        unit3Questions.add(new Question(
                "What is the period of f(x) = 3cos(2x)?",
                "π", "2π", "π/2", "4π",
                "A", 3, 2021, "medium"));

        unit3Questions.add(new Question(
                "Which identity is correct for all x?",
                "1 + tan^2(x) = sec^2(x)", "1 + cot^2(x) = tan^2(x)", "sin^2(x) + cos(x) = 1", "tan^2(x) + 1 = csc^2(x)",
                "A", 3, 2022, "medium"));

        unit3Questions.add(new Question(
                "The graph of y = 2sin(x) - 1 has what vertical shift?",
                "Up 2", "Down 1", "Up 1", "Down 2",
                "B", 3, 2023, "easy"));

        unit3Questions.add(new Question(
                "Simplify sin(x) / cos(x):",
                "cos(x)", "tan(x)", "cot(x)", "sec(x)",
                "B", 3, 2024, "easy"));

        unit3Questions.add(new Question(
                "The polar coordinates (r, θ) = (-2, π/3) correspond to which Cartesian coordinates?",
                "(-1, √3)", "(1, -√3)", "(-1, -√3)", "(1, √3)",
                "C", 3, 2025, "medium"));

        unit3Questions.add(new Question(
                "Which function has a vertical asymptote at x = π?",
                "sin(x)", "cos(x)", "tan(x)", "sec(x)",
                "C", 3, 2026, "medium"));

        unit3Questions.add(new Question(
                "The exact value of cot(π/4) is:",
                "0", "1", "-1", "Undefined",
                "B", 3, 2027, "easy"));

        unit3Questions.add(new Question(
                "Which is the graph of y = -cos(x) reflected about?",
                "x-axis", "y-axis", "Origin", "No reflection",
                "A", 3, 2028, "medium"));

        unit3Questions.add(new Question(
                "Convert 210° to radians:",
                "7π/6", "5π/6", "3π/4", "2π/3",
                "A", 3, 2029, "easy"));

        unit3Questions.add(new Question(
                "Which is the exact value of sec(π/3)?",
                "1/2", "2", "1", "√3/2",
                "B", 3, 2030, "medium"));

        unit3Questions.add(new Question(
                "Simplify sin(θ) * csc(θ):",
                "1", "sin^2(θ)", "cos^2(θ)", "0",
                "A", 3, 2031, "easy"));

        unit3Questions.add(new Question(
                "Which polar equation represents a circle?",
                "r = 3cos(θ)", "r = 2θ", "r = θ^2", "r = 1 + cos(θ)",
                "A", 3, 2032, "medium"));

        unit3Questions.add(new Question(
                "The amplitude of y = -4sin(3x) is:",
                "4", "-4", "3", "1",
                "A", 3, 2033, "easy"));

        unit3Questions.add(new Question(
                "If f(x) = sin(2x), what is its period?",
                "π", "2π", "π/2", "4π",
                "A", 3, 2034, "medium"));

        unit3Questions.add(new Question(
                "Which identity is correct?",
                "1 + cot^2(x) = csc^2(x)", "tan^2(x) + 1 = csc^2(x)", "sin^2(x) + cos(x) = 1", "sec^2(x) - 1 = csc^2(x)",
                "A", 3, 2035, "medium"));

        unit3Questions.add(new Question(
                "What is the exact value of sin(5π/6)?",
                "1/2", "√3/2", "-1/2", "-√3/2",
                "A", 3, 2036, "medium"));

        unit3Questions.add(new Question(
                "The Cartesian coordinates (x, y) = (√3, 1) correspond to which polar coordinates?",
                "(2, π/6)", "(2, π/3)", "(1, π/6)", "(1, π/3)",
                "B", 3, 2037, "medium"));

        unit3Questions.add(new Question(
                "Which function is undefined at θ = π?",
                "tan(θ)", "cot(θ)", "csc(θ)", "sec(θ)",
                "B", 3, 2038, "medium"));

        unit3Questions.add(new Question(
                "Which sinusoidal function has amplitude 5 and vertical shift -2?",
                "y = 5sin(x)", "y = 5sin(x) - 2", "y = 2sin(x) + 5", "y = 5cos(x + 2)",
                "B", 3, 2039, "easy"));

        unit3Questions.add(new Question(
                "Simplify sin(2x) using the double-angle formula:",
                "2sin(x)cos(x)", "sin^2(x) - cos^2(x)", "1 - 2sin^2(x)", "2cos^2(x) - 1",
                "A", 3, 2040, "medium"));

        unit3Questions.add(new Question(
                "Simplify cos(2x) using the Pythagorean identity:",
                "cos^2(x) - sin^2(x)", "2sin(x)cos(x)", "1 - 2sin^2(x)", "2cos^2(x) - 1",
                "A", 3, 2041, "medium"));

        unit3Questions.add(new Question(
                "Which is the exact value of sin(7π/6)?",
                "-1/2", "1/2", "-√3/2", "√3/2",
                "A", 3, 2042, "medium"));

        unit3Questions.add(new Question(
                "Which identity is correct for all x?",
                "sin(x + y) = sin(x)cos(y) + cos(x)sin(y)", "sin(x + y) = sin(x)sin(y) + cos(x)cos(y)", "cos(x - y) = sin(x)cos(y) - cos(x)sin(y)", "tan(x + y) = tan(x) + tan(y)",
                "A", 3, 2043, "medium"));

        unit3Questions.add(new Question(
                "The graph of y = 3cos(2x - π/4) has amplitude:",
                "1", "2", "3", "π/4",
                "C", 3, 2044, "easy"));

        unit3Questions.add(new Question(
                "The period of y = 4sin(πx) is:",
                "1", "2", "π", "2π",
                "B", 3, 2045, "medium"));

        unit3Questions.add(new Question(
                "Convert 330° to radians:",
                "11π/6", "5π/3", "7π/6", "π/6",
                "A", 3, 2046, "easy"));

        unit3Questions.add(new Question(
                "Simplify cos(x) / sin(x):",
                "tan(x)", "cot(x)", "csc(x)", "sec(x)",
                "B", 3, 2047, "easy"));

        unit3Questions.add(new Question(
                "Which polar equation represents a cardioid?",
                "r = 2(1 + cos(θ))", "r = 3θ", "r = θ^2", "r = 1",
                "A", 3, 2048, "medium"));

        unit3Questions.add(new Question(
                "Which is the exact value of sec(π/4)?",
                "1", "√2", "2", "√3",
                "B", 3, 2049, "medium"));

        unit3Questions.add(new Question(
                "The Cartesian coordinates (x, y) = (-√2, √2) correspond to which polar coordinates?",
                "(2, 3π/4)", "(2, 5π/4)", "(√2, π/4)", "(√2, 7π/4)",
                "A", 3, 2050, "medium"));

        unit3Questions.add(new Question(
                "Simplify cos(x - y) using the cosine difference formula:",
                "cos(x)cos(y) + sin(x)sin(y)", "cos(x)cos(y) - sin(x)sin(y)", "sin(x)cos(y) - cos(x)sin(y)", "tan(x - y) = tan(x) - tan(y)",
                "B", 3, 2051, "medium"));

        unit3Questions.add(new Question(
                "Which function has amplitude 5 and vertical shift 3?",
                "y = 5sin(x) + 3", "y = 3sin(x) + 5", "y = 5cos(x - 3)", "y = 5cos(x)",
                "A", 3, 2052, "easy"));

        unit3Questions.add(new Question(
                "Which function is undefined at θ = π/2?",
                "sin(θ)", "cos(θ)", "tan(θ)", "csc(θ)",
                "C", 3, 2053, "medium"));

        unit3Questions.add(new Question(
                "Simplify tan(x + y) using the sum formula:",
                "(tan(x) + tan(y))/(1 - tan(x)tan(y))", "(tan(x) + tan(y))/(1 + tan(x)tan(y))", "tan(x) + tan(y)", "tan(x) - tan(y)",
                "B", 3, 2054, "hard"));

        unit3Questions.add(new Question(
                "The polar equation r = 2sin(θ) represents which shape?",
                "Circle", "Line", "Ellipse", "Parabola",
                "A", 3, 2055, "medium"));

        unit3Questions.add(new Question(
                "The exact value of cos(5π/4) is:",
                "-√2/2", "√2/2", "-1/2", "1/2",
                "A", 3, 2056, "medium"));

        unit3Questions.add(new Question(
                "Simplify cot^2(x) + 1 using a Pythagorean identity:",
                "tan^2(x)", "csc^2(x)", "sec^2(x)", "1",
                "B", 3, 2057, "medium"));

        unit3Questions.add(new Question(
                "Which is the amplitude of y = -6cos(x)?",
                "6", "-6", "1", "0",
                "A", 3, 2058, "easy"));

        unit3Questions.add(new Question(
                "The polar coordinates (r, θ) = (4, 7π/6) correspond to which Cartesian coordinates?",
                "(-2√3, -2)", "(-2√3, 2)", "(2√3, -2)", "(2√3, 2)",
                "A", 3, 2059, "medium"));

        unit3Questions.add(new Question(
                "Simplify sin(x)cos(y) + cos(x)sin(y) using a trigonometric identity:",
                "sin(x + y)", "cos(x + y)", "tan(x + y)", "cot(x + y)",
                "A", 3, 2060, "medium"));

        unit3Questions.add(new Question(
                "Simplify cos(x)cos(y) - sin(x)sin(y):",
                "cos(x + y)", "sin(x + y)", "tan(x + y)", "cot(x + y)",
                "A", 3, 2061, "medium"));

        unit3Questions.add(new Question(
                "Which is the exact value of tan(π/6)?",
                "√3", "1/√3", "1", "0",
                "B", 3, 2062, "medium"));

        unit3Questions.add(new Question(
                "Which equation represents a rose curve with 4 petals?",
                "r = 3cos(2θ)", "r = 2sin(θ)", "r = θ", "r = 1 + cos(θ)",
                "A", 3, 2063, "medium"));

        unit3Questions.add(new Question(
                "Simplify 1 - 2sin^2(x) using a double-angle formula:",
                "cos(2x)", "sin(2x)", "tan(2x)", "1 - cos(2x)",
                "A", 3, 2064, "medium"));

        unit3Questions.add(new Question(
                "The exact value of sin(3π/4) is:",
                "1/2", "√2/2", "√3/2", "-√2/2",
                "B", 3, 2065, "easy"));

        unit3Questions.add(new Question(
                "Convert 315° to radians:",
                "7π/4", "5π/4", "π/4", "3π/4",
                "A", 3, 2066, "easy"));

        unit3Questions.add(new Question(
                "Which is the exact value of csc(π/4)?",
                "√2", "1/√2", "2", "1",
                "A", 3, 2067, "medium"));

        unit3Questions.add(new Question(
                "Simplify tan(x) + cot(x):",
                "(tan^2(x) + 1)/tan(x)", "1", "tan^2(x)", "cot^2(x)",
                "A", 3, 2068, "hard"));

        unit3Questions.add(new Question(
                "Which polar equation represents a limaçon?",
                "r = 1 + 2cos(θ)", "r = 2θ", "r = 3cos(2θ)", "r = θ^2",
                "A", 3, 2069, "medium"));

        unit3Questions.add(new Question(
                "The graph of y = 5sin(2x + π/3) has what phase shift?",
                "π/3 left", "π/3 right", "2π/3 left", "2π/3 right",
                "A", 3, 2070, "medium"));

        unit3Questions.add(new Question(
                "Solve for x: sin(x) = √3/2 in [0, 2π]:",
                "π/3, 2π/3", "π/6, 5π/6", "π/4, 3π/4", "π/3, 4π/3",
                "A", 3, 2071, "medium"));

        unit3Questions.add(new Question(
                "Simplify cos^2(x) - sin^2(x) using a double-angle formula:",
                "cos(2x)", "sin(2x)", "1 - cos(2x)", "2sin^2(x) - 1",
                "A", 3, 2072, "medium"));

        unit3Questions.add(new Question(
                "The exact value of cos(7π/6) is:",
                "-√3/2", "√3/2", "-1/2", "1/2",
                "C", 3, 2073, "medium"));

        unit3Questions.add(new Question(
                "Which function is undefined at θ = 0?",
                "tan(θ)", "cot(θ)", "sec(θ)", "csc(θ)",
                "B", 3, 2074, "medium"));

        unit3Questions.add(new Question(
                "The polar coordinates (r, θ) = (3, 2π/3) correspond to which Cartesian coordinates?",
                "(-3/2, 3√3/2)", "(-3√3/2, 3/2)", "(3/2, 3√3/2)", "(-3√3/2, -3/2)",
                "B", 3, 2075, "medium"));

        unit3Questions.add(new Question(
                "Which is the exact value of sec(3π/4)?",
                "-√2", "√2", "-1", "1",
                "A", 3, 2076, "medium"));

        unit3Questions.add(new Question(
                "Simplify sin^2(x) - cos^2(x) using a double-angle identity:",
                "-cos(2x)", "cos(2x)", "-sin(2x)", "sin(2x)",
                "A", 3, 2077, "medium"));

        unit3Questions.add(new Question(
                "The graph of y = -2cos(3x) has amplitude:",
                "2", "-2", "3", "1",
                "A", 3, 2078, "easy"));

        unit3Questions.add(new Question(
                "Which equation represents a circle in polar form centered at the origin with radius 5?",
                "r = 5", "r = 5cos(θ)", "r = θ", "r = 5 + cos(θ)",
                "A", 3, 2079, "easy"));

        unit3Questions.add(new Question(
                "Simplify sin(x)cos(y) - cos(x)sin(y) using a trig identity:",
                "sin(x - y)", "cos(x - y)", "tan(x - y)", "cot(x - y)",
                "A", 3, 2080, "medium"));

        unit3Questions.add(new Question(
                "Simplify cos(x)cos(y) + sin(x)sin(y):",
                "cos(x - y)", "cos(x + y)", "sin(x + y)", "tan(x + y)",
                "B", 3, 2081, "medium"));

        unit3Questions.add(new Question(
                "Simplify sin^2(x) using a double-angle formula:",
                "(1 - cos(2x))/2", "(1 + cos(2x))/2", "cos(2x)/2", "2cos^2(x) - 1",
                "A", 3, 2082, "medium"));

        unit3Questions.add(new Question(
                "Simplify cos^2(x) using a double-angle formula:",
                "(1 - cos(2x))/2", "(1 + cos(2x))/2", "cos(2x)/2", "2sin^2(x) - 1",
                "B", 3, 2083, "medium"));

        unit3Questions.add(new Question(
                "Which polar equation represents a circle shifted right 2 units?",
                "r = 2 + 2cos(θ)", "r = 2cos(θ)", "r = θ + 2", "r = 2θ",
                "A", 3, 2084, "medium"));

        unit3Questions.add(new Question(
                "Simplify sin(3x) using the triple-angle formula:",
                "3sin(x) - 4sin^3(x)", "3sin^2(x) - sin^3(x)", "4sin^3(x) - 3sin(x)", "sin(x) + sin(2x)",
                "A", 3, 2085, "hard"));

        unit3Questions.add(new Question(
                "Simplify cos(3x) using the triple-angle formula:",
                "4cos^3(x) - 3cos(x)", "3cos(x) - 4cos^3(x)", "cos^3(x) - 3cos(x)", "3cos^2(x) - cos^3(x)",
                "A", 3, 2086, "hard"));

        unit3Questions.add(new Question(
                "Solve for θ: 2sin^2(θ) - 1 = 0 in [0, 2π]:",
                "π/4, 3π/4, 5π/4, 7π/4", "π/6, 5π/6", "π/3, 2π/3", "π/2, 3π/2",
                "A", 3, 2087, "medium"));

        unit3Questions.add(new Question(
                "The exact value of cot(π/3) is:",
                "√3", "1/√3", "1", "0",
                "B", 3, 2088, "medium"));

        unit3Questions.add(new Question(
                "Which polar equation represents a rose curve with 5 petals?",
                "r = 3cos(5θ)", "r = 2sin(4θ)", "r = 1 + cos(θ)", "r = θ",
                "A", 3, 2089, "medium"));

        unit3Questions.add(new Question(
                "Simplify sin(x) + sin(y) using the sum-to-product formula:",
                "2sin((x+y)/2)cos((x-y)/2)", "2cos((x+y)/2)sin((x-y)/2)", "sin(x+y)cos(x-y)", "cos(x+y)sin(x-y)",
                "A", 3, 2090, "hard"));

        unit3Questions.add(new Question(
                "Simplify cos(x) + cos(y) using the sum-to-product formula:",
                "2cos((x+y)/2)cos((x-y)/2)", "2sin((x+y)/2)cos((x-y)/2)", "cos(x+y) + cos(x-y)", "cos(x)cos(y)",
                "A", 3, 2091, "hard"));

        unit3Questions.add(new Question(
                "Which is the exact value of sin(11π/6)?",
                "-1/2", "1/2", "√3/2", "-√3/2",
                "A", 3, 2092, "medium"));

        unit3Questions.add(new Question(
                "Simplify tan(x) - tan(y) using a single fraction:",
                "(sin(x - y))/(cos(x)cos(y))", "(cos(x - y))/(sin(x)sin(y))", "tan(x)tan(y)", "tan(x + y)",
                "A", 3, 2093, "hard"));

        unit3Questions.add(new Question(
                "The graph of y = 3sin(4x - π/2) has a period of:",
                "π/2", "π", "π/4", "2π",
                "A", 3, 2094, "medium"));

        unit3Questions.add(new Question(
                "Which function is undefined at θ = π/2?",
                "sin(θ)", "cos(θ)", "tan(θ)", "cot(θ)",
                "C", 3, 2095, "medium"));

        unit3Questions.add(new Question(
                "Convert (-√2, √2) from Cartesian to polar coordinates:",
                "(2, 3π/4)", "(2, 5π/4)", "(√2, 3π/4)", "(√2, 5π/4)",
                "A", 3, 2096, "medium"));

        unit3Questions.add(new Question(
                "Which is the exact value of sec(5π/6)?",
                "-2/√3", "-2", "-√3/2", "-2/√3",
                "B", 3, 2097, "medium"));

        unit3Questions.add(new Question(
                "Simplify sin^2(x)cos^2(x) using a double-angle identity:",
                "1/4 sin^2(2x)", "1/2 sin(2x)", "1 - cos^2(2x)", "1/2 cos^2(x)",
                "A", 3, 2098, "hard"));

        unit3Questions.add(new Question(
                "The polar coordinates (r, θ) = (5, π/2) correspond to which Cartesian coordinates?",
                "(0, 5)", "(5, 0)", "(0, -5)", "(-5, 0)",
                "A", 3, 2099, "medium"));


        numUnit3Questions = unit3Questions.size();
        System.out.printf("There are %d questions in unit 3%n", numUnit3Questions);
    }

}

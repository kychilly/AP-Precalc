package com.Discord.DiscordBot.Z_Units;

import com.Discord.DiscordBot.Units.Question;

import static com.Discord.DiscordBot.Units.QuestionBank.unit2Questions;

public class Unit2 {

    public static int numUnit2Questions;

    public static void initializeUnit2Questions() {
        unit2Questions.add(new Question(
                "Which of the following is the parent function of exponential growth?",
                "y = 2^x", "y = log(x)", "y = -2^x", "y = 1/x",
                "A", 2, 1000, "easy"));

        unit2Questions.add(new Question(
                "What is the inverse of y = 3^x?",
                "y = log(x)", "y = log_3(x)", "y = ln(x)", "y = 1/3^x",
                "B", 2, 1001, "easy"));

        unit2Questions.add(new Question(
                "Simplify: log(1000). Assume base 10.",
                "1", "2", "3", "1000",
                "C", 2, 1002, "easy"));

        unit2Questions.add(new Question(
                "What is the range of y = 2^x?",
                "(0, ∞)", "(-∞, ∞)", "[0, ∞)", "(-∞, 0)",
                "A", 2, 1003, "easy"));

        unit2Questions.add(new Question(
                "If ln(x) = 2, what is x?",
                "2", "e^2", "ln(2)", "1/e^2",
                "B", 2, 1004, "easy"));

        unit2Questions.add(new Question(
                "Rewrite log_5(25) in exponential form.",
                "5^25 = ?", "25^5 = ?", "5^2 = 25", "log(25) = 5",
                "C", 2, 1005, "easy"));

        unit2Questions.add(new Question(
                "Which of the following represents exponential decay?",
                "y = (1/2)^x", "y = 2^x", "y = log(x)", "y = x^2",
                "A", 2, 1006, "medium"));

        unit2Questions.add(new Question(
                "Simplify: log(2) + log(5). Assume base 10.",
                "log(10)", "log(7)", "log(25)", "2 log(10)",
                "A", 2, 1007, "medium"));

        unit2Questions.add(new Question(
                "Which of the following is equivalent to log_b(x^3)?",
                "3 log_b(x)", "log_b(3x)", "log_b(x) + 3", "x log_b(3)",
                "A", 2, 1008, "medium"));

        unit2Questions.add(new Question(
                "The half-life of a substance is 10 years. If you start with 100 grams, how much remains after 20 years?",
                "50 g", "25 g", "10 g", "75 g",
                "B", 2, 1009, "medium"));

        unit2Questions.add(new Question(
                "Convert 2 log(3) into a single logarithm.",
                "log(9)", "log(6)", "log(1/9)", "2 log(6)",
                "A", 2, 1010, "medium"));

        unit2Questions.add(new Question(
                "Solve for x: 3^x = 81",
                "3", "4", "5", "9",
                "B", 2, 1011, "medium"));

        unit2Questions.add(new Question(
                "Simplify: log(100) / log(10).",
                "1", "2", "10", "100",
                "B", 2, 1012, "medium"));

        unit2Questions.add(new Question(
                "What is the horizontal asymptote of y = 5e^(-x)?",
                "y = 0", "y = 5", "x = 0", "y = -5",
                "A", 2, 1013, "medium"));

        unit2Questions.add(new Question(
                "Which function grows faster as x → ∞?",
                "y = ln(x)", "y = x^2", "y = 2^x", "y = sqrt(x)",
                "C", 2, 1014, "hard"));

        unit2Questions.add(new Question(
                "Solve for x: log_2(x) = 5",
                "2", "25", "32", "10",
                "C", 2, 1015, "hard"));

        unit2Questions.add(new Question(
                "Rewrite e^(ln(7)) in simplest form.",
                "7", "e^7", "ln(7)", "1/7",
                "A", 2, 1016, "hard"));

        unit2Questions.add(new Question(
                "Solve: ln(x) = -1",
                "1/e", "-1", "e", "0",
                "A", 2, 1017, "hard"));

        unit2Questions.add(new Question(
                "The population of a city is modeled by P(t) = 5000(1.02)^t. What is the annual growth rate?",
                "0.2%", "2%", "20%", "200%",
                "B", 2, 1018, "hard"));

        unit2Questions.add(new Question(
                "Solve for x: e^(2x) = 20",
                "ln(20)", "(1/2) ln(20)", "2 ln(20)", "20 ln(2)",
                "B", 2, 1019, "hard"));

        unit2Questions.add(new Question(
                "What is the domain of y = log(x)?",
                "(0, ∞)", "(-∞, ∞)", "(-∞, 0)", "[0, ∞)",
                "A", 2, 1020, "easy"));

        unit2Questions.add(new Question(
                "Simplify: log(1). Assume base 10.",
                "0", "1", "10", "Undefined",
                "A", 2, 1021, "easy"));

        unit2Questions.add(new Question(
                "Which of the following is true about exponential functions?",
                "They have horizontal asymptotes", "They cross the y-axis at (0,1)", "Their range is (0, ∞)", "All of the above",
                "D", 2, 1022, "easy"));

        unit2Questions.add(new Question(
                "If f(x) = e^x, then f(ln(5)) = ?",
                "e", "5", "ln(5)", "1/5",
                "B", 2, 1023, "easy"));

        unit2Questions.add(new Question(
                "What is log_2(1)?",
                "0", "1", "2", "Undefined",
                "A", 2, 1024, "easy"));

        unit2Questions.add(new Question(
                "Rewrite log(100) + log(1000). Assume base 10.",
                "log(1001000)", "log(10000)", "log(1000/100)", "log(1)",
                "B", 2, 1025, "medium"));

        unit2Questions.add(new Question(
                "Simplify: log(8) - log(2). Assume base 10.",
                "log(4)", "log(6)", "log(16)", "log(10)",
                "A", 2, 1026, "medium"));

        unit2Questions.add(new Question(
                "Which of the following is equivalent to ln(a^b)?",
                "a ln(b)", "ln(a) + b", "b ln(a)", "ln(a/b)",
                "C", 2, 1027, "medium"));

        unit2Questions.add(new Question(
                "If log_3(x) = 4, then x = ?",
                "12", "27", "81", "64",
                "C", 2, 1028, "medium"));

        unit2Questions.add(new Question(
                "Solve for x: 2^x = 1/8",
                "-2", "-3", "3", "1/4",
                "B", 2, 1029, "medium"));

        unit2Questions.add(new Question(
                "The graph of y = log(x) is reflected over the x-axis. Its equation is:",
                "y = log(-x)", "y = -log(x)", "y = log(1/x)", "y = -log(-x)",
                "B", 2, 1030, "medium"));

        unit2Questions.add(new Question(
                "Simplify: e^(ln(4) + ln(5))",
                "9", "20", "ln(20)", "e^20",
                "B", 2, 1031, "medium"));

        unit2Questions.add(new Question(
                "Solve for x: ln(x+1) = 0",
                "0", "1", "e", "-1",
                "A", 2, 1032, "medium"));

        unit2Questions.add(new Question(
                "Which has the faster end behavior growth as x → ∞?",
                "y = 10x", "y = e^x", "y = log(x)", "y = sqrt(x)",
                "B", 2, 1033, "medium"));

        unit2Questions.add(new Question(
                "Solve: log(2x) = log(6)",
                "x = 2", "x = 3", "x = 6", "x = 12",
                "B", 2, 1034, "medium"));

        unit2Questions.add(new Question(
                "Solve: 5^(x-1) = 125",
                "x = 3", "x = 4", "x = 5", "x = 2",
                "B", 2, 1035, "hard"));

        unit2Questions.add(new Question(
                "Simplify: log_2(32) + log_2(4)",
                "5", "6", "7", "9",
                "C", 2, 1036, "hard"));

        unit2Questions.add(new Question(
                "Solve for x: ln(2x) = 3",
                "x = e^3", "x = e^3 / 2", "x = 2e^3", "x = 3e^2",
                "B", 2, 1037, "hard"));

        unit2Questions.add(new Question(
                "If P(t) = 1000e^(0.07t), what is the continuous growth rate?",
                "7%", "0.7%", "70%", "0.07%",
                "A", 2, 1038, "hard"));

        unit2Questions.add(new Question(
                "Solve for x: 10^(2x) = 500",
                "x = log(5)", "x = log(500)/2", "x = 2 log(500)", "x = log(50)",
                "B", 2, 1039, "hard"));

        // Unit 2 - Exponential and Logarithmic Functions (continued)

        unit2Questions.add(new Question(
                "What is the y-intercept of y = 3^x?",
                "(0, 1)", "(0, 0)", "(1, 0)", "(0, 3)",
                "A", 2, 1040, "easy"));

        unit2Questions.add(new Question(
                "Which of the following is equivalent to log_10(100)?",
                "0", "1", "2", "10",
                "C", 2, 1041, "easy"));

        unit2Questions.add(new Question(
                "Rewrite ln(1) in simplest form.",
                "0", "1", "Undefined", "e",
                "A", 2, 1042, "easy"));

        unit2Questions.add(new Question(
                "Which transformation occurs in y = 2^x + 3 compared to y = 2^x?",
                "Shift left 3", "Shift right 3", "Shift up 3", "Shift down 3",
                "C", 2, 1043, "easy"));

        unit2Questions.add(new Question(
                "What is the asymptote of y = log(x)?",
                "x = 0", "y = 0", "y = 1", "x = 1",
                "A", 2, 1044, "easy"));

        unit2Questions.add(new Question(
                "Simplify: log(25) - log(5).",
                "log(20)", "log(5)", "log(125)", "log(1/5)",
                "B", 2, 1045, "medium"));

        unit2Questions.add(new Question(
                "If log_4(x) = 1/2, then x = ?",
                "2", "4", "8", "16",
                "A", 2, 1046, "medium"));

        unit2Questions.add(new Question(
                "Solve for x: e^x = 7",
                "x = ln(7)", "x = 7", "x = log(7)", "x = e^7",
                "A", 2, 1047, "medium"));

        unit2Questions.add(new Question(
                "Convert log_3(81) into exponential form.",
                "3^81 = ?", "3^4 = 81", "81^3 = ?", "log(3) = 81",
                "B", 2, 1048, "medium"));

        unit2Questions.add(new Question(
                "Which property is used to rewrite log(ab) = log(a) + log(b)?",
                "Quotient Rule", "Power Rule", "Product Rule", "Exponential Rule",
                "C", 2, 1049, "medium"));

        unit2Questions.add(new Question(
                "Solve: ln(x) + ln(2) = ln(10)",
                "x = 5", "x = 10", "x = 20", "x = e^2",
                "A", 2, 1050, "medium"));

        unit2Questions.add(new Question(
                "What is the inverse of y = ln(x)?",
                "y = log(x)", "y = 1/x", "y = e^x", "y = -ln(x)",
                "C", 2, 1051, "medium"));

        unit2Questions.add(new Question(
                "Which of the following has domain (-∞, ∞)?",
                "y = ln(x)", "y = 2^x", "y = log(x)", "y = e^x",
                "D", 2, 1052, "medium"));

        unit2Questions.add(new Question(
                "Solve: 4^(x+1) = 64",
                "x = 2", "x = 3", "x = 4", "x = 5",
                "A", 2, 1053, "hard"));

        unit2Questions.add(new Question(
                "Simplify: log(1000) / log(10).",
                "1", "2", "3", "10",
                "C", 2, 1054, "hard"));

        unit2Questions.add(new Question(
                "Solve for x: ln(5x) = 2",
                "x = e^2", "x = e^2 / 5", "x = 5e^2", "x = ln(2)/5",
                "B", 2, 1055, "hard"));

        unit2Questions.add(new Question(
                "If a bacteria culture grows according to P(t) = 200e^(0.1t), what is P(0)?",
                "0", "20", "200", "1",
                "C", 2, 1056, "hard"));

        unit2Questions.add(new Question(
                "Solve for x: log_5(x) = -2",
                "x = -25", "x = 25", "x = 1/25", "x = -1/25",
                "C", 2, 1057, "hard"));

        unit2Questions.add(new Question(
                "Which has the slower growth as x → ∞?",
                "y = ln(x)", "y = x^3", "y = 2^x", "y = e^x",
                "A", 2, 1058, "hard"));

        unit2Questions.add(new Question(
                "Solve for x: e^(x-2) = 15",
                "x = ln(15) - 2", "x = ln(15) + 2", "x = 2 + ln(15)", "x = 2 - ln(15)",
                "C", 2, 1059, "hard"));

        unit2Questions.add(new Question(
                "What is the base of the natural logarithm function?",
                "10", "2", "e", "π",
                "C", 2, 1060, "easy"));

        unit2Questions.add(new Question(
                "Evaluate log_2(8).",
                "1", "2", "3", "4",
                "C", 2, 1061, "easy"));

        unit2Questions.add(new Question(
                "Which of the following functions is exponential?",
                "y = 2^x", "y = x^2", "y = log(x)", "y = 1/x",
                "A", 2, 1062, "easy"));

        unit2Questions.add(new Question(
                "What is ln(e^5)?",
                "e^5", "5", "1", "0",
                "B", 2, 1063, "easy"));

        unit2Questions.add(new Question(
                "What is the domain of y = e^x?",
                "(0, ∞)", "(-∞, ∞)", "[0, ∞)", "(-∞, 0)",
                "B", 2, 1064, "easy"));

        unit2Questions.add(new Question(
                "Simplify: log(100) + log(0.01).",
                "log(1)", "log(10000)", "log(100.01)", "0",
                "A", 2, 1065, "medium"));

        unit2Questions.add(new Question(
                "If log_7(x) = 0, then x = ?",
                "1", "7", "0", "Undefined",
                "A", 2, 1066, "medium"));

        unit2Questions.add(new Question(
                "Solve: 3^(x+2) = 81",
                "x = 2", "x = 3", "x = 4", "x = 5",
                "A", 2, 1067, "medium"));

        unit2Questions.add(new Question(
                "Simplify: ln(√e).",
                "1", "1/2", "e", "0",
                "B", 2, 1068, "medium"));

        unit2Questions.add(new Question(
                "Which is the vertical asymptote of y = log(x-4)?",
                "x = -4", "x = 0", "x = 4", "y = 4",
                "C", 2, 1069, "medium"));

        unit2Questions.add(new Question(
                "Solve for x: 5^x = 1/125",
                "-2", "-3", "-4", "-5",
                "B", 2, 1070, "medium"));

        unit2Questions.add(new Question(
                "Which equation represents exponential decay?",
                "y = (3/2)^x", "y = (1/2)^x", "y = 2^x", "y = x^3",
                "B", 2, 1071, "medium"));

        unit2Questions.add(new Question(
                "Rewrite 2 log(7) as a single logarithm.",
                "log(14)", "log(49)", "log(7^2)", "log(2^7)",
                "B", 2, 1072, "medium"));

        unit2Questions.add(new Question(
                "Solve for x: ln(x) = 4",
                "x = 4", "x = ln(4)", "x = e^4", "x = 1/4",
                "C", 2, 1073, "medium"));

        unit2Questions.add(new Question(
                "Simplify: log(50) - log(2).",
                "log(25)", "log(100)", "log(48)", "log(10)",
                "A", 2, 1074, "medium"));

        unit2Questions.add(new Question(
                "Solve for x: e^(3x) = 20",
                "x = ln(20)", "x = 3 ln(20)", "x = ln(20)/3", "x = e^20/3",
                "C", 2, 1075, "hard"));

        unit2Questions.add(new Question(
                "If f(x) = log(x+1), what is f(9)?",
                "1", "2", "10", "log(10)",
                "D", 2, 1076, "hard"));

        unit2Questions.add(new Question(
                "Solve: 7^(2x) = 49",
                "x = 1", "x = 2", "x = 3", "x = 1/2",
                "A", 2, 1077, "hard"));

        unit2Questions.add(new Question(
                "Simplify: ln(e^(-3)).",
                "ln(3)", "-3", "1/e^3", "3",
                "B", 2, 1078, "hard"));

        unit2Questions.add(new Question(
                "A radioactive isotope decays according to P(t) = P₀ e^(-0.05t). What percent of the substance remains after 20 units of time?",
                "36.8%", "50%", "13.5%", "86.5%",
                "A", 2, 1079, "hard"));

        // Unit 2 - Exponential and Logarithmic Functions (continued)

        unit2Questions.add(new Question(
                "Evaluate log_5(25).",
                "1", "2", "5", "25",
                "B", 2, 1080, "easy"));

        unit2Questions.add(new Question(
                "What is the range of y = ln(x)?",
                "(-∞, ∞)", "(0, ∞)", "[0, ∞)", "(1, ∞)",
                "A", 2, 1081, "easy"));

        unit2Questions.add(new Question(
                "Simplify: log_2(16).",
                "2", "3", "4", "8",
                "C", 2, 1082, "easy"));

        unit2Questions.add(new Question(
                "Which is the inverse of y = 2^x?",
                "y = ln(x)", "y = log_2(x)", "y = 1/2^x", "y = 2x",
                "B", 2, 1083, "easy"));

        unit2Questions.add(new Question(
                "The graph of y = e^x is shifted 4 units down. Its equation is:",
                "y = e^(x-4)", "y = e^x - 4", "y = e^(x+4)", "y = 4e^x",
                "B", 2, 1084, "easy"));

        unit2Questions.add(new Question(
                "Simplify: log(10) + log(100).",
                "log(10)", "log(1000)", "log(110)", "log(100)",
                "B", 2, 1085, "medium"));

        unit2Questions.add(new Question(
                "Solve: 2^x = 32",
                "x = 4", "x = 5", "x = 6", "x = 3",
                "B", 2, 1086, "medium"));

        unit2Questions.add(new Question(
                "Rewrite log_3(1/9) as a negative exponent.",
                "-2", "-1/2", "2", "1/2",
                "A", 2, 1087, "medium"));

        unit2Questions.add(new Question(
                "Simplify: ln(e^7).",
                "7", "e^7", "ln(7)", "1/7",
                "A", 2, 1088, "medium"));

        unit2Questions.add(new Question(
                "Solve for x: log_10(x) = 3",
                "x = 10", "x = 30", "x = 1000", "x = 300",
                "C", 2, 1089, "medium"));

        unit2Questions.add(new Question(
                "Which of the following is a property of logarithms?",
                "log(a*b) = log(a) + log(b)", "log(a/b) = log(a) - log(b)", "log(a^n) = n log(a)", "All of the above",
                "D", 2, 1090, "medium"));

        unit2Questions.add(new Question(
                "Solve for x: 3^(2x) = 81",
                "x = 2", "x = 3", "x = 4", "x = 5",
                "A", 2, 1091, "medium"));

        unit2Questions.add(new Question(
                "Solve: ln(3x) = 4",
                "x = e^4 / 3", "x = 3e^4", "x = ln(4)/3", "x = 4/3",
                "A", 2, 1092, "medium"));

        unit2Questions.add(new Question(
                "Simplify: log(1000) - log(10).",
                "1", "10", "2", "100",
                "C", 2, 1093, "medium"));

        unit2Questions.add(new Question(
                "The population of a town grows according to P(t) = 500 e^(0.03t). What is the continuous growth rate?",
                "0.3%", "3%", "30%", "0.03%",
                "B", 2, 1094, "hard"));

        unit2Questions.add(new Question(
                "Solve for x: e^(x+1) = 10",
                "x = ln(10) - 1", "x = ln(10) + 1", "x = 10 - 1", "x = ln(10)/1",
                "A", 2, 1095, "hard"));

        unit2Questions.add(new Question(
                "Solve: log_2(x-1) = 3",
                "x = 8", "x = 9", "x = 7", "x = 4",
                "B", 2, 1096, "hard"));

        unit2Questions.add(new Question(
                "Which function grows faster as x → ∞?",
                "y = ln(x)", "y = x", "y = 2^x", "y = sqrt(x)",
                "C", 2, 1097, "hard"));

        unit2Questions.add(new Question(
                "Simplify: ln(1/e^3).",
                "-3", "3", "1/3", "ln(3)",
                "A", 2, 1098, "hard"));

        unit2Questions.add(new Question(
                "A radioactive substance decays according to P(t) = P₀ e^(-0.1t). What fraction remains after 10 units of time?",
                "≈0.37", "≈0.90", "≈0.10", "≈0.50",
                "A", 2, 1099, "hard"));


        numUnit2Questions = unit2Questions.size();
        System.out.printf("There are %d questions in unit 2%n", numUnit2Questions);
    }



}

package com.example.ancet;

import jakarta.servlet.http.*;
import java.io.IOException;

public class QuestionServlet extends HttpServlet {
    static final int QUESTION_1_YES=0;
    static final int QUESTION_1_NO=1;
    static final int QUESTION_2_YES=2;
    static final int QUESTION_2_NO=3;
    static final int QUESTION_3_YES=4;
    static final int QUESTION_3_NO=5;
    static final int QUESTION_4_YES=6;
    static final int QUESTION_4_NO=7;
    static final int QUESTION_5_YES=8;
    static final int QUESTION_5_NO=9;
    static final int QUESTION_6_YES=10;
    static final int QUESTION_6_NO=11;
    static final int QUESTION_7_YES=12;
    static final int QUESTION_7_NO=13;

    static final String TEMPLATE = "<html>" + "<head><title>Results</title></head>" + "<body><h1>%s</h1></body></html>";

    final int[] results = new int[14];

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        final String q1 = req.getParameter("question1");
        final String q2 = req.getParameter("question2");
        final String q3 = req.getParameter("question3");
        final String q4 = req.getParameter("question4");
        final String q5 = req.getParameter("question5");
        final String q6 = req.getParameter("question6");
        final String q7 = req.getParameter("question7");

        if (q1 == null || q2 == null || q3 == null || q4 == null || q5 == null || q6 == null || q7 == null) {
            String errmsg = "<p><h2>Please answer all questions!</h2></p><form action='index.jsp'><input type='submit' value='Try again'></form>";
            resp.getWriter().println(errmsg);
            return;
        }
        final int idx1 = "male".equals(q1) ? QUESTION_1_YES : QUESTION_1_NO;
        final int idx2 = "yes".equals(q2) ? QUESTION_2_YES : QUESTION_2_NO;
        final int idx3 = "yes".equals(q3) ? QUESTION_3_YES : QUESTION_3_NO;
        final int idx4 = "yes".equals(q4) ? QUESTION_4_YES : QUESTION_4_NO;
        final int idx5 = "yes".equals(q5) ? QUESTION_5_YES : QUESTION_5_NO;
        final int idx6 = "yes".equals(q6) ? QUESTION_6_YES : QUESTION_6_NO;
        final int idx7 = "yes".equals(q7) ? QUESTION_7_YES : QUESTION_7_NO;

        results[idx1]++;
        results[idx2]++;
        results[idx3]++;
        results[idx4]++;
        results[idx5]++;
        results[idx6]++;
        results[idx7]++;

        String res = "<p>Question 1: male = "+results[QUESTION_1_YES] + ", female = "+results[QUESTION_1_NO] + "</p>";
        res += "<p>Question 2: yes = "+results[QUESTION_2_YES] + ", no = "+results[QUESTION_2_NO] + "</p>";
        res += "<p>Question 3: yes = "+results[QUESTION_3_YES] + ", no = "+results[QUESTION_3_NO] + "</p>";
        res += "<p>Question 4: yes = "+results[QUESTION_4_YES] + ", no = "+results[QUESTION_4_NO] + "</p>";
        res += "<p>Question 5: yes = "+results[QUESTION_5_YES] + ", no = "+results[QUESTION_5_NO] + "</p>";
        res += "<p>Question 6: yes = "+results[QUESTION_6_YES] + ", no = "+results[QUESTION_6_NO] + "</p>";
        res += "<p>Question 7: yes = "+results[QUESTION_7_YES] + ", no = "+results[QUESTION_7_NO] + "</p>";

        res += "<form action='index.jsp'><input type='submit' value='Try again'></form>";


        resp.getWriter().println(String.format(TEMPLATE, res));
    }
}

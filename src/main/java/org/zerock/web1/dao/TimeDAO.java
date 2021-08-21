package org.zerock.web1.dao;

import org.zerock.db.util.JdbcTemplate;

public class TimeDAO {

    public String getTime() throws  RuntimeException {

        //StringBuffer를 사용한 이유????
        StringBuffer buffer = new StringBuffer();

        new JdbcTemplate() {
            @Override
            protected void execute() throws Exception {
                preparedStatement = connection.prepareStatement("select now()");
                resultSet = preparedStatement.executeQuery();
                resultSet.next();
//                System.out.println(resultSet.getString(1));
                buffer.append(resultSet.getString(1));

            }

        }.makeAll();

        return buffer.toString();
    }
}

//    static {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//
//    //RuntimeException -> 받아도되고 안받아도됨
//    public String getTime() throws RuntimeException {
//        Connection connection = null;
//        PreparedStatement preparedStatement = null;
//        ResultSet resultSet = null;
//        String currentTime = null;
//
//        try {
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bit08db", "myuser", "myuser");
//            preparedStatement = connection.prepareStatement("select now()");
//            resultSet = preparedStatement.executeQuery();
//
//            resultSet.next();
//
//            currentTime = resultSet.getString(1);
//
//
//        } catch (Exception e) {
//            throw new RuntimeException(e.getMessage());
//        } finally {
//            if (resultSet != null) {
//                try {
//                    resultSet.close();
//                } catch (Exception e) {
//                }
//            }
//            if (preparedStatement != null) {
//                try {
//                    preparedStatement.close();
//                } catch (Exception e) {
//                }
//            }
//            if (connection != null) {
//                try {
//                    connection.close();
//                } catch (Exception e) {
//                }
//            }
//
//                return currentTime;
//
//        }
//    }


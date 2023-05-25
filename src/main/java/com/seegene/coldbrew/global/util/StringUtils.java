package com.seegene.coldbrew.global.util;

public class StringUtils {
    /**
     * Check the parameter is null or blank.
     * @return true if the parameter is null.
     */
    public static boolean isNull(String str){
        return str==null || str.isBlank();
    }

    /**
     * @param camel `CamelCase` or `camelCase`
     * @return `snake_case`
     */
    public static String parseCamelToSnake(String camel){
        if(isNull(camel)){
            return camel;
        }else{
            String snake;

            char init = camel.charAt(0);
            snake = ""+Character.toLowerCase(init);

            for(int i=1; i<camel.length(); i++){
                char ch = camel.charAt(i);
                if(Character.isUpperCase(ch)){
                    snake += "_"+Character.toLowerCase(ch);
                }else{
                    snake += ch;
                }
            }

            return snake;
        }
    }

    /**
     * Parse `snake_case` string to `camelCase` without white space.
     * @param snake `snake_case`
     * @return camelCase
     */
    public static String parseSnakeToCamel(String snake){
        String[] units = snake.split("_");
        StringBuffer result = new StringBuffer();

        for(String unit : units){
            if(result.isEmpty()){
                result.append(unit.toLowerCase());
            }else if(unit.length()==1) {
                result.append(unit.toUpperCase());
            }else{
                result.append(unit.substring(0, 1).toUpperCase()+unit.substring(1).toLowerCase());
            }
        }

        return result.toString();
    }
}

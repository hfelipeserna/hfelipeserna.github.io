package main.java;

public class StatementGenerator_dentist {

    public static String insert(String professionalCard, String name, String surname) {
        return "INSERT INTO dentist (id, tipo, nombre) VALUES (" + professionalCard + ",'" + name + "','" + surname + "')";
    }

    public static String selectAll() {
        return "SELECT * FROM dentist";
    }

    public static String delete(Integer id) {
        return "DELETE from dentist WHERE id = " + id.toString();
    }
}

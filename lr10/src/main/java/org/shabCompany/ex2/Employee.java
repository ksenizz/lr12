package org.shabCompany.ex2;

import org.shabCompany.ex2.exception.OkladException;

public class Employee {
  private String fio;
  private String position;
  private double salary;

  public Employee(String fio, String position, double salary) throws OkladException {
    if (salary < 0) {
      throw new OkladException("Невозможно создать сотрудника – указан отрицательный оклад: " + salary);
    }
    if (fio.trim().isEmpty()){
      throw new NullPointerException("ФИО не может быть пустым.");
    }
    String[] fioParts = fio.trim().split("\\s+");
    if (fioParts.length != 3) {
      throw new IllegalArgumentException("ФИО должно состоять из трёх слов: фамилия, имя, отчество.");
    }
    if (position.trim().isEmpty()) {
      throw new NullPointerException("Должность не может быть пустой.");
    }
    this.fio = fio;
    this.position = position;
    this.salary = salary;
  }

  public String getFio() {
    return fio;
  }
  public void setFio(String fio) {
    this.fio = fio;
  }

  public String getPosition() {
    return position;
  }
  public void setPosition(String position) {
    this.position = position;
  }

  public double getSalary() {
    return salary;
  }
  public void setSalary(double salary) {
    this.salary = salary;
  }

  public double calculateSalary() {
    return salary;
  }
}

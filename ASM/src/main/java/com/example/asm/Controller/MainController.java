package com.example.asm.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainController {

    @FXML
    private PieChart totalPieChart;

    @FXML
    private LineChart<Number, Number> incomeLineChart, expenseLineChart;

    @FXML
    private ChoiceBox<String> incomeMonthChoiceBox, expenseMonthChoiceBox;

    @FXML
    private TextField incomeTextField, incomeSourceField;

    @FXML
    private TextField expenseTextField, expenseSourceField;

    @FXML
    private TableView<DataEntry> expenseTable, incomeTable;
    @FXML
    private TableColumn<DataEntry, Integer> expenseIndexColumn, incomeIndexColumn;
    @FXML
    private TableColumn<DataEntry, String> expenseSourceColumn, incomeSourceColumn;
    @FXML
    private TableColumn<DataEntry, Double> expenseAmountColumn, incomeAmountColumn;
    @FXML
    private TableColumn<DataEntry, String> incomeMonthColumn, expenseMonthColumn;


    static class BinaryTree {
        static class Node {
            DataEntry data;
            Node left, right;

            public Node(DataEntry data) {
                this.data = data;
                left = right = null;
            }
        }

        private Node root;

        // Thêm dữ liệu vào cây (sắp xếp từ cao đến thấp)
        public void insert(DataEntry data) {
            root = insertRec(root, data);
        }

        private Node insertRec(Node root, DataEntry data) {
            if (root == null) {
                root = new Node(data);
                return root;
            }
            // Thay đổi điều kiện để sắp xếp từ cao đến thấp
            if (data.getAmount() > root.data.getAmount()) {  // Dữ liệu lớn hơn được đặt ở phía trái
                root.left = insertRec(root.left, data);
            } else {
                root.right = insertRec(root.right, data); // Dữ liệu nhỏ hơn được đặt ở phía phải
            }
            return root;
        }

        // Lấy dữ liệu theo thứ tự (sắp xếp từ cao đến thấp)
        public List<DataEntry> inorder() {
            List<DataEntry> result = new ArrayList<>();
            inorderRec(root, result);
            return result;
        }

        private void inorderRec(Node root, List<DataEntry> result) {
            if (root != null) {
                inorderRec(root.left, result);  // Truy cập bên trái (dữ liệu lớn hơn)
                result.add(root.data);  // Thêm vào kết quả
                inorderRec(root.right, result); // Truy cập bên phải (dữ liệu nhỏ hơn)
            }
        }
    }

    // Bubble Sort method
    private void bubbleSort(ObservableList<DataEntry> entries, boolean sortByAmount) {
        int n = entries.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                boolean condition = sortByAmount ?
                        entries.get(j).getAmount() > entries.get(j + 1).getAmount() :
                        entries.get(j).getMonth().compareTo(entries.get(j + 1).getMonth()) > 0;

                if (condition) {
                    DataEntry temp = entries.get(j);
                    entries.set(j, entries.get(j + 1));
                    entries.set(j + 1, temp);
                }
            }
        }
    }
    @FXML
    private void sortEByAmountBinaryTree() {
        BinaryTree expenseTree = new BinaryTree();
        expenseEntries.forEach(expenseTree::insert);
        List<DataEntry> sortedExpenseEntries = expenseTree.inorder();
        expenseEntries.setAll(sortedExpenseEntries);
        expenseTable.setItems(expenseEntries);
    }

    @FXML
    private void sortByEMonthBubbleSort() {
        bubbleSort(expenseEntries, false);
        expenseTable.setItems(expenseEntries);}


    @FXML
    private void sortIByAmountBinaryTree() {
        BinaryTree incomeTree = new BinaryTree();
        incomeEntries.forEach(incomeTree::insert);
        List<DataEntry> sortedIncomeEntries = incomeTree.inorder();
        incomeEntries.setAll(sortedIncomeEntries);
        incomeTable.setItems(incomeEntries);
    }

    @FXML
    private void sortIByMonthBubbleSort() {
        bubbleSort(incomeEntries, false);
        incomeTable.setItems(incomeEntries);
    }


    private final Map<Integer, Double> incomeData = new HashMap<>();
    private final Map<Integer, Double> expenseData = new HashMap<>();

    private final ObservableList<DataEntry> incomeEntries = FXCollections.observableArrayList();
    private final ObservableList<DataEntry> expenseEntries = FXCollections.observableArrayList();

    @FXML
    private void initialize() {
        expenseMonthChoiceBox.setItems(FXCollections.observableArrayList(
                "Tháng 1", "Tháng 2", "Tháng 3", "Tháng 4",
                "Tháng 5", "Tháng 6", "Tháng 7", "Tháng 8",
                "Tháng 9", "Tháng 10", "Tháng 11", "Tháng 12"
        ));
        incomeMonthChoiceBox.setItems(FXCollections.observableArrayList(
                "Tháng 1", "Tháng 2", "Tháng 3", "Tháng 4",
                "Tháng 5", "Tháng 6", "Tháng 7", "Tháng 8",
                "Tháng 9", "Tháng 10", "Tháng 11", "Tháng 12"
        ));

        expenseIndexColumn.setCellValueFactory(new PropertyValueFactory<>("index"));
        expenseSourceColumn.setCellValueFactory(new PropertyValueFactory<>("source"));
        expenseAmountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        expenseMonthColumn.setCellValueFactory(new PropertyValueFactory<>("month"));

        incomeIndexColumn.setCellValueFactory(new PropertyValueFactory<>("index"));
        incomeSourceColumn.setCellValueFactory(new PropertyValueFactory<>("source"));
        incomeAmountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        incomeMonthColumn.setCellValueFactory(new PropertyValueFactory<>("month"));

        expenseTable.setItems(expenseEntries);
        incomeTable.setItems(incomeEntries);
    }

    private void addEntry(ChoiceBox<String> monthChoiceBox, TextField sourceField, TextField amountField,
                          ObservableList<DataEntry> entries, Map<Integer, Double> dataMap, LineChart<Number, Number> chart) {
        try {
            int monthIndex = monthChoiceBox.getSelectionModel().getSelectedIndex();
            if (monthIndex == -1) {
                System.out.println("Please select a month.");
                return;
            }
            String month = monthChoiceBox.getItems().get(monthIndex);
            double amount = 0;
            try {
                amount = Double.parseDouble(amountField.getText().replace(",", "."));
                if (amount <= 0) {
                    throw new IllegalArgumentException("Amount must be positive.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            String source = sourceField.getText();

            entries.add(new DataEntry(entries.size() + 1, source, amount, month));
            dataMap.put(monthIndex + 1, dataMap.getOrDefault(monthIndex + 1, 0.0) + amount);

            updateLineChart(chart, dataMap);
            updatePieChart();

            amountField.clear();
            sourceField.clear();
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter correct data.");
        }
    }

    @FXML
    private void addIncome() {
        addEntry(incomeMonthChoiceBox, incomeSourceField, incomeTextField, incomeEntries, incomeData, incomeLineChart);
    }

    @FXML
    private void addExpense() {
        addEntry(expenseMonthChoiceBox, expenseSourceField, expenseTextField, expenseEntries, expenseData, expenseLineChart);
    }

    private void updatePieChart() {
        double totalIncome = incomeData.values().stream().mapToDouble(Double::doubleValue).sum();
        double totalExpense = expenseData.values().stream().mapToDouble(Double::doubleValue).sum();

        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("Thu nhập", totalIncome),
                new PieChart.Data("Chi tiêu", totalExpense)
        );

        totalPieChart.setData(pieChartData);
    }

    private void updateLineChart(LineChart<Number, Number> chart, Map<Integer, Double> data) {
        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        data.forEach((month, amount) -> series.getData().add(new XYChart.Data<>(month, amount)));

        chart.getData().clear();
        chart.getData().add(series);
    }

    public static class DataEntry {
        private final int index;
        private String source;
        private double amount;
        private String month;

        public DataEntry(int index, String source, double amount, String month) {
            this.index = index;
            this.source = source;
            this.amount = amount;
            this.month = month;
        }

        public int getIndex() {
            return index;
        }

        public String getSource() {
            return source;
        }
        public void setSource(String source) { this.source = source; }
        public void setAmount(double amount) { this.amount = amount; }
        public void setMonth(String month) { this.month = month; }

        public double getAmount() {
            return amount;
        }

        public String getMonth() {
            return month;
        }
    }
}

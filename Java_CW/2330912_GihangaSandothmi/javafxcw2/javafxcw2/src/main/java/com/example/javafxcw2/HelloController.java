package com.example.javafxcw2;

import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.*;


public class  HelloController implements Initializable {

    @FXML
    private TextField addAgeField;

    @FXML
    private Button addBtn;

    @FXML
    private TableView<HorseData> addTable;

    @FXML
    private TableColumn<HorseData, Integer> addHorseIDCol;

    @FXML
    private TableColumn<HorseData, String> addHNameCol;

    @FXML
    private TableColumn<HorseData, String> addJNameCol;

    @FXML
    private TableColumn<HorseData, Integer> addAgeCol;

    @FXML
    private TableColumn<HorseData, String> addBreedCol;

    @FXML
    private TableColumn<HorseData, Integer> addRaceRecordCol;

    @FXML
    private TableColumn<HorseData, String> addGroupCol;

    @FXML
    private TableColumn<HorseData, Image> addHorsePicCol;

    @FXML
    private TextField addBreedField;

    @FXML
    private TextField addRaceRecordField;

    @FXML
    private Pane addDetailsPane;
    @FXML
    private TextField addHName;
    @FXML
    private TextField addHId;
    @FXML
    private TextField addJName;
    @FXML
    private TextField addJAge;
    @FXML
    private TextField addBreed;
    @FXML
    private TextField addRecord;
    @FXML
    private TextField addGroup;
    @FXML
    private TextField addPicture;
    @FXML
    private TextField updateHName;
    @FXML
    private TextField updateHId;
    @FXML
    private TextField updateJName;
    @FXML
    private TextField updateJAge;
    @FXML
    private TextField updateBreed;
    @FXML
    private TextField updateRecord;
    @FXML
    private TextField updateGroup;
    @FXML
    private TextField addHNameField;

    @FXML
    private TextField addJNameField;

    @FXML
    private Button addSubmitBtn;

    @FXML
    private TextField addGroupField;

    @FXML
    private TextField addHorsePicField;

    @FXML
    private TextField addHorseIDField;

    @FXML
    private TableView<HorseData> deleteTable;

    @FXML
    private TableColumn<HorseData, Integer> deleteHorseIDCol;

    @FXML
    private TableColumn<HorseData, String> deleteHNameCol;

    @FXML
    private TableColumn<HorseData, String> deleteJNameCol;

    @FXML
    private TableColumn<HorseData, Integer> deleteAgeCol;

    @FXML
    private TableColumn<HorseData, String> deleteBreedCol;

    @FXML
    private TableColumn<HorseData, Integer> deleteRaceRecordCol;

    @FXML
    private TableColumn<HorseData, String> deleteGroupCol;

    @FXML
    private TableColumn<HorseData, Image> deleteHorsePicCol;

    @FXML
    private Button deleteBtn;

    @FXML
    private Pane deleteDetailsPane;

    @FXML
    private Button deleteSubmitBtn;

    @FXML
    private Button exitBtn;

    @FXML
    private Button loadDataBtn;

    @FXML private Pane loadDataPane;


    @FXML
    private Button manageBtn;

    @FXML
    private TableView<HorseData> manageTable;

    @FXML
    private TableColumn<HorseData, Integer> manageHIDcol;

    @FXML
    private TableColumn<HorseData, String> manageHNameCol;

    @FXML
    private TableColumn<HorseData, String> manageJNameCol;

    @FXML
    private TableColumn<HorseData, Integer> manageAgeCol;

    @FXML
    private TableColumn<HorseData, String> manageBreedCol;

    @FXML
    private TableColumn<HorseData, Integer> manageRaceRecordCol;

    @FXML
    private TableColumn<HorseData, String> manageGroupCol;

    @FXML
    private TableColumn<HorseData, Image> managePicCol;

    @FXML
    private Pane managePane;

    @FXML
    private Button menu;

    @FXML
    private Pane menuPane;

    @FXML
    private Button raceTableBtn;

    @FXML
    private Pane raceTablePane;

    @FXML
    private Button randomRaceBtn;

    @FXML
    private Pane randomRacepane;

    @FXML
    private Button saveDataBtn;

    @FXML
    private Pane saveDataPane;

    @FXML
    private Pane standingPane;

    @FXML
    private Button standingTableBtn;

    @FXML
    private TextField updateAgeField;

    @FXML
    private Button updateBtn;

    @FXML
    private TableView<HorseData> updateTable;

    @FXML
    private TableColumn<HorseData, Integer> updateHIDCol;

    @FXML
    private TableColumn<HorseData, String> updateHNameCol;

    @FXML
    private TableColumn<HorseData, String> updateJNameCol;

    @FXML
    private TableColumn<HorseData, Integer> updateAgeCol;

    @FXML
    private TableColumn<HorseData, String> updateBreedCol;

    @FXML
    private TableColumn<HorseData, Integer> updateRaceRecordCol;

    @FXML
    private TableColumn<HorseData, String> updateGroupCol;

    @FXML

    private TableColumn<HorseData, Image> updatePicCol;


    @FXML
    private TextField updateCarField;


    @FXML
    private TextField updateCurrentPField;

    @FXML
    private Pane updateDetailsPane;

    @FXML
    private TextField updateNameField;

    @FXML
    private Button updateSubmitBtn;

    @FXML
    private TextField updateTeamField;

    @FXML
    private Label addMsgLabel;

    @FXML
    private Label deleteMsgLabel;

    @FXML
    private Button standingSortBtn;

    @FXML
    private TableView<HorsePlace> standingTable;

    @FXML
    private TableColumn<HorsePlace, Integer> PlaceSortPlaceCol;

    @FXML
    private TableColumn<HorsePlace, Integer> PlaceSortHorseIDCol;

    @FXML
    private TableColumn<HorsePlace, String> PlaceSortHNameCol;

    @FXML
    private TableColumn<HorsePlace, String> PlaceSortGroupCol;

    @FXML
    private TableColumn<HorsePlace, String> PlaceSortHorsePicCol;
    @FXML
    private TableColumn<HorsePlace, LocalTime> PlaceSortTimeCol;

    @FXML
    private Button saveChooseBtn;


    @FXML
    private Label saveDataMsgLabel;

    @FXML
    private Label updateMsgLabel;

    @FXML
    private Button simulateRaceBtn;

    @FXML
    private TableView<MajorRoundData> randomRaceTable;

    @FXML
    private DatePicker randomDate;

    @FXML
    private TableColumn<MajorRoundData, Integer> randomDateCol;

    @FXML
    private TableColumn<MajorRoundData, String> randomLocationCol;

    @FXML
    private TableColumn<MajorRoundData, String> randomNameCol;

    @FXML
    private TableColumn<MajorRoundData, Integer> randomPointsCol;

    @FXML
    private TableColumn<MajorRoundData, Integer> randomPositionCol;

    @FXML
    private TableColumn<MajorRoundData, Integer> dateSortDateCol;

    @FXML
    private TableColumn<MajorRoundData, String> dateSortLocationCol;

    @FXML
    private TableColumn<MajorRoundData, String> dateSortNameCol;

    @FXML
    private TableColumn<MajorRoundData, Integer> dateSortPointsCol;

    @FXML
    private TableColumn<MajorRoundData, Integer> dateSortPositionCol;

    @FXML
    private TableView<MajorRoundData> dateSortTable;

    @FXML
    private Button sortByDateBtn;

    @FXML
    private Button deleteBack;

    @FXML
    private Button addBackBtn;

    @FXML
    private Button updateBackBtn;

    @FXML
    private Label randomRaceMsgLabel;

    @FXML
    private Label standingMsgLabel;

    @FXML
    private Label vrlMsgLabel;

    @FXML
    private TableView<HorseData> majorRoundTable;
    @FXML
    private TableColumn<HorseData, Integer> MajorHorseIDCol;
    @FXML
    private TableColumn<HorseData, String> MajorHNameCol;
    @FXML
    private TableColumn<HorseData, String> MajorGroupCol;
    @FXML
    private TableColumn<HorseData, String> MajorHorsePicCol;


    @FXML
    private Button majorRoundBtn;

    @FXML
    private Button VisualizingBtn;
    @FXML
    private Pane VisualizingPane;

    @FXML
    private Button horseDetailsTableBtn;

    @FXML
    private Button winningHorsesBtn;
    private ArrayList<HorseData> raceHorses = new ArrayList<>();

    private ObservableList<HorseData> myHorse = FXCollections.observableArrayList();

    private ObservableList<MajorRoundData> myRace = FXCollections.observableArrayList();
    private ObservableList<HorseData> deleteHorse = FXCollections.observableArrayList();
    private ObservableList<HorseData> majorRound =FXCollections.observableArrayList();
    private ObservableList<HorsePlace> placement = FXCollections.observableArrayList();
    List<Object[]> horseDataList = new ArrayList<>();
    @FXML
    private TextField dltID;
    @FXML
    private TableView<HorseData> BreedSortTable;
    @FXML
    private TableColumn<HorseData,Integer> IDSortHorseIDCol;
    @FXML
    private TableColumn<HorseData,String> IDSortHNameCol;
    @FXML
    private TableColumn<HorseData,String> IDSortJNameCol;
    @FXML
    private TableColumn<HorseData,Integer> IDSortAgeCol;
    @FXML
    private TableColumn<HorseData,String> IDSortBreedCol;

    @FXML
    private TableColumn<HorseData,Integer> IDSortRaceRecordCol;
    @FXML
    private TableColumn<HorseData,String> IDSortGroupCol;

    @FXML
    private TableColumn<HorseData,Image> IDSortHorsePicCol;
    @FXML
    private BarChart<String,Number> visualizeChart;
    @FXML
    private NumberAxis yAxis;
    @FXML
    private CategoryAxis xAxis;

    private HorseData updatehorse=null;

    private ObservableList<String> chart_x = FXCollections.observableArrayList();
    private ObservableList<LocalTime> chart_y = FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        manageHIDcol.setCellValueFactory(new PropertyValueFactory<HorseData, Integer>("horseID"));
        manageHNameCol.setCellValueFactory(new PropertyValueFactory<HorseData, String>("horseName"));
        manageJNameCol.setCellValueFactory(new PropertyValueFactory<HorseData, String>("jockeyName"));
        manageAgeCol.setCellValueFactory(new PropertyValueFactory<HorseData, Integer>("horseAge"));
        manageBreedCol.setCellValueFactory(new PropertyValueFactory<HorseData, String>("horseBreed"));
        manageRaceRecordCol.setCellValueFactory(new PropertyValueFactory<HorseData, Integer>("raceRecord"));
        manageGroupCol.setCellValueFactory(new PropertyValueFactory<HorseData, String>("group"));
        managePicCol.setCellFactory(col -> new ImageeCell());
        managePicCol.setCellValueFactory(new PropertyValueFactory<>("horsePicture"));

        addHorseIDCol.setCellValueFactory(new PropertyValueFactory<HorseData, Integer>("horseID"));
        addHNameCol.setCellValueFactory(new PropertyValueFactory<HorseData, String>("horseName"));
        addJNameCol.setCellValueFactory(new PropertyValueFactory<HorseData, String>("jockeyName"));
        addAgeCol.setCellValueFactory(new PropertyValueFactory<HorseData, Integer>("horseAge"));
        addBreedCol.setCellValueFactory(new PropertyValueFactory<HorseData, String>("horseBreed"));
        addRaceRecordCol.setCellValueFactory(new PropertyValueFactory<HorseData, Integer>("raceRecord"));
        addGroupCol.setCellValueFactory(new PropertyValueFactory<HorseData, String>("group"));
        addHorsePicCol.setCellFactory(col -> new ImageeCell());
        addHorsePicCol.setCellValueFactory(new PropertyValueFactory<>("horsePicture"));

        updateHIDCol.setCellValueFactory(new PropertyValueFactory<HorseData, Integer>("horseID"));
        updateHNameCol.setCellValueFactory(new PropertyValueFactory<HorseData, String>("horseName"));
        updateJNameCol.setCellValueFactory(new PropertyValueFactory<HorseData, String>("jockeyName"));
        updateAgeCol.setCellValueFactory(new PropertyValueFactory<HorseData, Integer>("horseAge"));
        updateBreedCol.setCellValueFactory(new PropertyValueFactory<HorseData, String>("horseBreed"));
        updateRaceRecordCol.setCellValueFactory(new PropertyValueFactory<HorseData, Integer>("raceRecord"));
        updateGroupCol.setCellValueFactory(new PropertyValueFactory<HorseData, String>("group"));
        updatePicCol.setCellFactory(col -> new ImageeCell());
        updatePicCol.setCellValueFactory(new PropertyValueFactory<>("horsePicture"));

        updateTable.getSelectionModel().selectedItemProperty().addListener((ObservableValue,HorseData,horse)->
        {
            updatehorse = horse;
            updateHId.setText(horse.getHorseID().toString());
            updateHName.setText(horse.getHorseName());
            updateJAge.setText(horse.getHorseAge().toString());
            updateJName.setText(horse.getJockeyName());
            updateBreed.setText(horse.getHorseBreed());
            updateRecord.setText(horse.getRaceRecord().toString());
            updateGroup.setText(horse.getGroup());
        });

        deleteHorseIDCol.setCellValueFactory(new PropertyValueFactory<HorseData, Integer>("horseID"));
        deleteHNameCol.setCellValueFactory(new PropertyValueFactory<HorseData, String>("horseName"));
        deleteJNameCol.setCellValueFactory(new PropertyValueFactory<HorseData, String>("jockeyName"));
        deleteAgeCol.setCellValueFactory(new PropertyValueFactory<HorseData, Integer>("horseAge"));
        deleteBreedCol.setCellValueFactory(new PropertyValueFactory<HorseData, String>("horseBreed"));
        deleteRaceRecordCol.setCellValueFactory(new PropertyValueFactory<HorseData, Integer>("raceRecord"));
        deleteGroupCol.setCellValueFactory(new PropertyValueFactory<HorseData, String>("group"));
        deleteHorsePicCol.setCellFactory(col -> new ImageeCell());
        deleteHorsePicCol.setCellValueFactory(new PropertyValueFactory<>("horsePicture"));


        IDSortHorseIDCol.setCellValueFactory(new PropertyValueFactory<HorseData, Integer>("horseID"));
        IDSortHNameCol.setCellValueFactory(new PropertyValueFactory<HorseData, String>("horseName"));
        IDSortJNameCol.setCellValueFactory(new PropertyValueFactory<HorseData, String>("jockeyName"));
        IDSortAgeCol.setCellValueFactory(new PropertyValueFactory<HorseData, Integer>("horseAge"));
        IDSortBreedCol.setCellValueFactory(new PropertyValueFactory<HorseData, String>("horseBreed"));
        IDSortRaceRecordCol.setCellValueFactory(new PropertyValueFactory<HorseData, Integer>("raceRecord"));
        IDSortGroupCol.setCellValueFactory(new PropertyValueFactory<HorseData, String>("group"));
        IDSortHorsePicCol.setCellFactory(col -> new ImageeCell());
        IDSortHorsePicCol.setCellValueFactory(new PropertyValueFactory<>("horsePicture"));

        PlaceSortPlaceCol.setCellValueFactory(new PropertyValueFactory<HorsePlace, Integer>("place"));
        PlaceSortHorseIDCol.setCellValueFactory(new PropertyValueFactory<HorsePlace, Integer>("HorseId"));
        PlaceSortHNameCol.setCellValueFactory(new PropertyValueFactory<HorsePlace, String>("HorseName"));
        PlaceSortGroupCol.setCellValueFactory(new PropertyValueFactory<HorsePlace, String>("HorseGroup"));
        PlaceSortHorsePicCol.setCellValueFactory(new PropertyValueFactory<HorsePlace, String>("HorsePicture"));
        PlaceSortTimeCol.setCellValueFactory(new PropertyValueFactory<HorsePlace, LocalTime>("time"));

        MajorHorseIDCol.setCellValueFactory(new PropertyValueFactory<HorseData, Integer>("horseID"));
        MajorHNameCol.setCellValueFactory(new PropertyValueFactory<HorseData, String>("horseName"));
        MajorGroupCol.setCellValueFactory(new PropertyValueFactory<HorseData, String>("group"));
        MajorHorsePicCol.setCellValueFactory(new PropertyValueFactory<HorseData, String>("horsePicture"));

        chart();

        addTable.setItems(myHorse);
        deleteTable.setItems(myHorse);
        manageTable.setItems(myHorse);
        updateTable.setItems(myHorse);
        standingTable.setItems(placement);
        majorRoundTable.setItems(majorRound);
        BreedSortTable.setItems(myHorse);
        ActionEvent event = new ActionEvent();

    }

    @FXML
    public void fillFields(MouseEvent event) {
        //Get the selection from table and fill that data to text fields.
        HorseData selected = updateTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            updateHId.setText(selected.getHorseID().toString());
            updateHName.setText(selected.getHorseName());
            updateJAge.setText(selected.getHorseAge().toString());
            updateJName.setText(selected.getJockeyName());
            updateBreed.setText(selected.getHorseBreed());
            updateRecord.setText(selected.getRaceRecord().toString());
            updateGroup.setText(selected.getGroup());
        }else {
            updateHId.clear();
            updateHName.clear();
            updateJAge.clear();
            updateJName.clear();
            updateBreed.clear();
            updateRecord.clear();
            updateGroup.clear();
        }
    }

    void chart()
    {

        xAxis.setLabel("Horse");
        xAxis.setStyle("-fx-text-fill: white; -fx-font-size: 28px;");
        xAxis.setTickLabelRotation(90);
        yAxis.setLabel("Time");
        yAxis.setStyle("-fx-text-fill: white; -fx-font-size: 28px;");

        XYChart.Series<String,Number> series1 = new XYChart.Series<>();
        int count=1;

        for (HorsePlace place:placement)
        {

            LocalTime time = place.getTime();
            int min = time.getMinute();
            int sec = time.getSecond();
            int total = min * 60 + sec;
            series1.getData().add(new XYChart.Data<>(count + " place", total));
            count+=1;
        }
        visualizeChart.getData().add(series1);
    }

    @FXML
    void AddHorse(ActionEvent actionEvent) {
        HorseData Horse = null;
        try {

            // Get horse information from user input

            int horseID;
            try {
                horseID = Integer.parseInt(addHId.getText());
            } catch (NumberFormatException ex) {
                showMsgAdd("Horse ID must be an integer", false);
                return;
            }

            // Check if the horse ID is in the correct range
            if (horseID < 1 || horseID > 999) {
                showMsgAdd("Horse ID must be between 001 and 999", false);
                return;
            }

            String horseName = addHName.getText();
            // Check if the name is empty or contains non-alphabetic characters
            if (horseName.isEmpty()) {
                showMsgAdd("Please Enter horse's Name", false);
                return;
            } else if (!horseName.matches("[a-zA-Z ]+")) {
                showMsgAdd("The name field can only contain alphabetic characters", false);
                return;
            }

            String jockeyName = addJName.getText();
            // Check if the name is empty or contains non-alphabetic characters
            if (jockeyName.isEmpty()) {
                showMsgAdd("Please Enter jockey's Name", false);
                return;
            } else if (!jockeyName.matches("[a-zA-Z ]+")) {
                showMsgAdd("The name field can only contain alphabetic characters", false);
                return;
            }

            int horseAge = Integer.parseInt(addJAge.getText());
            // Check if the horse age is within a valid range
            if (horseAge < 3 || horseAge > 25){
                showMsgAdd("Horses must be between 3 and 25 years old", false);
                return;
            }

            String horseBreed = addBreed.getText();
            // Check if the horse's breed is empty
            if (horseBreed.isEmpty()) {
                showMsgAdd("Please Enter horse's breed", false);
                return;
            }

            int raceRecord = Integer.parseInt(addRecord.getText());
            // Check if the horse age is within a valid range
            if (raceRecord < 0){
                showMsgAdd("Race record cannot be less than 0.", false);
                return;
            }

            String group = addGroup.getText().toUpperCase();
            // Check if the group name is empty
            if (group.isEmpty()) {
                showMsgAdd("Please Enter a group name", false);
                return;
            }
            // Check if the team name is one of A, B, C, or D
            if (!group.matches("[ABCD]")) {
                showMsgAdd("Group name must be one of: A, B, C, or D", false);
                return;
            }

            Image horsePicture = horseImage;
            // Check if the horse picture URL is empty
            if (horsePicture == null) {
                showMsgAdd("Please insert the horse picture", false);
                return;
            }


            // Create a new horse data object with the user input
            Horse = new HorseData(horseID, horseName, jockeyName, horseAge, horseBreed, raceRecord, group, horsePicture);

            horseImage = null;
        } catch (NumberFormatException t) {
            // Catch any NumberFormatException that may occur
            showMsgAdd("Invalid Horse", false);
        }

        if (Horse != null) {
            for (int i = 0; i < myHorse.size(); i++) {
                // Check if the horse ID already exists in the list
                if (myHorse.get(i).getHorseID() == Horse.getHorseID()) {
                    showMsgAdd("Horse with ID " + Horse.getHorseID() + " Already Exists", false);
                    return;
                }
            }
            // Add the new horse to the list of horses
            myHorse.add(new HorseData(Horse.getHorseID(), Horse.getHorseName(), Horse.getJockeyName(), Horse.getHorseAge(), Horse.getHorseBreed(), Horse.getRaceRecord(),  Horse.getGroup(), Horse.getHorsePicture()));
            showMsgAdd("Horse with ID " + Horse.getHorseID() + " Added Successfully", true);
            // Clear the input fields
            addHId.setText("");
            addHName.setText("");
            addJName.setText("");
            addJAge.setText("");
            addBreed.setText("");
            addRecord.setText("");
            addGroup.setText("");
        } else {
            showMsgAdd("Error in adding new horse", false);
        }


    }

    @FXML
    void updateHorse(ActionEvent actionEvent) {
        HorseData Hor = null;
        try {

            // Get horse information from user input

            int horseID;
            try {
                horseID = Integer.parseInt(updateHId.getText());
            } catch (NumberFormatException ex) {
                showMsgAdd("Horse ID must be an integer", false);
                return;
            }

            // Check if the horse ID is in the correct range
            if (horseID < 1 || horseID > 999) {
                showMsgAdd("Horse ID must be between 001 and 999", false);
                return;
            }

            String horseName = updateHName.getText();
            // Check if the name is empty or contains non-alphabetic characters
            if (horseName.isEmpty()) {
                showMsgAdd("Please Enter horse's Name", false);
                return;
            } else if (!horseName.matches("[a-zA-Z ]+")) {
                showMsgUpdate("The name field can only contain alphabetic characters", false);
                return;
            }

            String jockeyName = updateJName.getText();
            // Check if the name is empty or contains non-alphabetic characters
            if (jockeyName.isEmpty()) {
                showMsgAdd("Please Enter jockey's Name", false);
                return;
            } else if (!jockeyName.matches("[a-zA-Z ]+")) {
                showMsgUpdate("The name field can only contain alphabetic characters", false);
                return;
            }

            int horseAge = Integer.parseInt(updateJAge.getText());
            // Check if the horse age is within a valid range
            if (horseAge < 3 || horseAge > 25){
                showMsgUpdate("Horses must be between 3 and 25 years old", false);
                return;
            }

            String horseBreed = updateBreed.getText();
            // Check if the horse's breed is empty
            if (horseBreed.isEmpty()) {
                showMsgUpdate("Please Enter horse's breed", false);
                return;
            }

            int raceRecord = Integer.parseInt(updateRecord.getText());
            // Check if the horse age is within a valid range
            if (raceRecord < 0){
                showMsgUpdate("Race record cannot be less than 0.", false);
                return;
            }

            String group = updateGroup.getText().toUpperCase();
            // Check if the group name is empty
            if (group.isEmpty()) {
                showMsgUpdate("Please Enter a group name", false);
                return;
            }
            // Check if the group name is one of A, B, C, or D
            if (!group.matches("[ABCD]")) {
                showMsgUpdate("Group name must be one of: A, B, C, or D", false);
                return;
            }

            Image horsePicture = updatehorse.getHorsePicture();

            Hor = new HorseData(horseID, horseName, jockeyName, horseAge, horseBreed, raceRecord, group, horsePicture);

            horseImage = null;

        } catch (NumberFormatException t) {
            // Catch any NumberFormatException that may occur
            showMsgAdd("Please enter valid input", false);
        }


        if (Hor != null) {
            // Check for duplicate horse ID
            int selectedHorseIndex = updateTable.getSelectionModel().getFocusedIndex();
            for (int i = 0; i < updateTable.getItems().size(); i++) {
                if (i != selectedHorseIndex) {
                    HorseData horseDetails = updateTable.getItems().get(i);
                    if (horseDetails.getHorseID() == Hor.getHorseID()) {
                        showMsgUpdate("Horse with ID " + Hor.getHorseID() + " already exists", false);
                        return;
                    }
                }
            }
            updateHId.clear();
            updateHName.clear();
            updateJName.clear();
            updateJAge.clear();
            updateBreed.clear();
            updateRecord.clear();
            updateGroup.clear();

            // Update the horse data
            if (selectedHorseIndex >= 0 && selectedHorseIndex < myHorse.size()) {
                myHorse.set(selectedHorseIndex, Hor);
                showMsgUpdate("Horse with ID " + Hor.getHorseID() + " updated successfully", true);
                // Clear the input fields
                updateHId.setText("");
                updateHName.setText("");
                updateJName.setText("");
                updateJAge.setText("");
                updateBreed.setText("");
                updateRecord.setText("");
                updateGroup.setText("");
            } else {
                showMsgUpdate("Invalid index for updating horse", false);
            }
        } else {
            showMsgUpdate("Error in updating horse", false);
        }

    }


    @FXML
    void deleteHorse(ActionEvent actionEvent){
        if (myHorse.isEmpty()) {
            showMsgDelete("Driver list is empty", false);
            return;
        }
        HorseData selected = deleteTable.getSelectionModel().getSelectedItem();
        myHorse.remove(selected);
        deleteTable.refresh();
        showMsgDelete("Deleted Successfully", true);
    }
    @FXML
    void onDltSearch(ActionEvent actionEvent)
    {
        if(!dltID.getText().isEmpty())
        {
            int id = Integer.parseInt(dltID.getText());
            for (HorseData horse : myHorse) {
                if (horse.getHorseID().equals(id)) {
                    deleteHorse.add(horse);
                }
            }
            deleteTable.setItems(deleteHorse);
        }
    }


    @FXML
    void WinningHorseTable(ActionEvent actionEvent){

        if(!horseDataList.isEmpty())

        {
            ArrayList<HorseData> horses = new ArrayList<>();
            ArrayList<LocalTime> times = new ArrayList<>();
            for(Object[] obj:horseDataList)
            {
                horses.add((HorseData)obj[0]);
                times.add((LocalTime)obj[1]);
            }
            ArrayList<HorseData> horses_new = new ArrayList<>();
            ArrayList<LocalTime> times_new = new ArrayList<>();
            while (!horses.isEmpty())
            {
                for (int i = 0; i < horses.size(); i++)
                {
                    LocalTime min_time = max_time(times);
                    int min_time_index = times.indexOf(min_time);
                    horses_new.add(horses.get(min_time_index));
                    times_new.add(times.get(min_time_index));
                    horses.remove(min_time_index);
                    times.remove(min_time_index);

                }
            }
            for(int i=0;i<3;i++)
            {
                HorseData horse = horses_new.get(i);
                HorsePlace place = new HorsePlace(i+1,horse.getHorseID(),horse.getHorseName(),horse.getGroup(),horse.getHorsePicture(),times_new.get(i));
                placement.add(place);
            }
            standingTable.setItems(placement);

        }

    }

    private LocalTime max_time(ArrayList<LocalTime> time_list)
    {
        LocalTime max=time_list.get(0);
        for (int i=0;i<time_list.size();i++)
        {
            if (time_list.get(i).isBefore(max))
            {
                max=time_list.get(i);
            }
        }
        return max;
    }

    @FXML
    public void simulateRandomRace(ActionEvent actionEvent) {
        // Check if there are atleast 3 racers entered
        int limit=1;

        if (myHorse.size() < limit*4) {
            showMsgRandomRace("Please enter atleast 4 Horse details", false);
        } else {

            addBtn.setDisable(true);
            updateBtn.setDisable(true);
            deleteBtn.setDisable(true);

            // Create a PrintWriter to write the random race details to a file
            try {

                majorRound.clear();
                majorRoundTable.refresh();
                ArrayList<HorseData> groupA= new ArrayList<>();
                ArrayList<HorseData> groupB= new ArrayList<>();
                ArrayList<HorseData> groupC= new ArrayList<>();
                ArrayList<HorseData> groupD= new ArrayList<>();

                for (int i = 0; i < myHorse.size(); i++)
                {
                    HorseData horse  = myHorse.get(i);
                    switch (horse.getGroup()) {
                        case "A" -> groupA.add(horse);
                        case "B" -> groupB.add(horse);
                        case "C" -> groupC.add(horse);
                        case "D" -> groupD.add(horse);
                    }
                }
                Random rand = new Random();

                for(int i=0;i<limit;i++) {
                    int a = rand.nextInt(0, groupA.size());
                    int b = rand.nextInt(0, groupB.size());
                    int c = rand.nextInt(0, groupC.size());
                    int d = rand.nextInt(0, groupD.size());

                    HorseData horseA = groupA.get(a);
                    HorseData horseB = groupB.get(b);
                    HorseData horseC = groupC.get(c);
                    HorseData horseD = groupD.get(d);

                    raceHorses.clear();

                    raceHorses.add(horseA);
                    raceHorses.add(horseB);
                    raceHorses.add(horseC);
                    raceHorses.add(horseD);
                }

                ArrayList<LocalTime> raceTimes = new ArrayList<>();

                for (int i=0;i<limit*4;i++)
                {

                    int time = rand.nextInt(10,90);


                    int remainder = time%60;
                    int min = time/60;
                    int sec = remainder;

                    String timeString = "0"+min+":"+sec;
                    LocalTime t = LocalTime.of(0,min,sec);
                    raceTimes.add(t);
                }
                ArrayList<HorseData> horses = new ArrayList<>();
                ArrayList<LocalTime> times = new ArrayList<>();


                for(int i=0;i<limit*4;i++)
                {

                    horseDataList.add(new Object[]{raceHorses.get(i),raceTimes.get(i)});
                }
                try


                {
                    for (int i = 0; i < limit * 4; i++) {

                        for (int j = 0; j < limit * 4; j++) {
                            int max_time_index = raceTimes.indexOf(max_time(raceTimes));
                            horses.add(raceHorses.get(max_time_index));
                            times.add(raceTimes.get(max_time_index));
                            raceHorses.remove(max_time_index);
                            raceTimes.remove(max_time_index);
                        }
                    }
                }
                catch (IndexOutOfBoundsException e)
                {
                    ;
                }

                majorRound.addAll(horses);
                majorRoundTable.setItems(majorRound);



            }

                catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }

    private void raceLoad(){
        File file = new File("D:\\C\\Desktop\\Uni Module\\Year 1\\Programming Fundamentals\\Java\\Java CW\\2330912_GihangaSandothmi\\javafxcw2\\javafxcw2\\src\\main\\resources\\com\\example\\javafxcw2\\horse.txt");
        if (file != null) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line = null;

                while ((line = reader.readLine()) != null) {
                    String[] split = line.split(",");
                    int id = Integer.parseInt(split[0]);
                    String HName = split[1];
                    int age = Integer.parseInt(split[2]);
                    String JName = split[3];
                    String group = split[4];
                    int RaceRecord = Integer.parseInt(split[5]);
                    String breed = split[6];
                    String pic = split[7];



                }
                randomRaceTable.setItems(myRace);


            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private Image horseImage;

    @FXML
    void selectImage(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select Horse Image");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif", "*.jpeg")
        );
        File selectedFile = fileChooser.showOpenDialog(new Stage());
        if (selectedFile != null) {
            horseImage = new Image(selectedFile.toURI().toString());
        }
    }

    @FXML
    void selectImage2(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select Horse Image");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif")
        );
        File selectedFile = fileChooser.showOpenDialog(new Stage());
        if (selectedFile != null) {
            horseImage = new Image(selectedFile.toURI().toString());
        }
    }


    @FXML
    void vrl (ActionEvent actionEvent){
        if (myHorse.size() < 2) {
            showMsgVrl("Please enter atleast 2 Race details", false);
        }else {
            ArrayList<HorseData> horses = new ArrayList<>();
            ArrayList<Integer> id = new ArrayList<>();
            for(HorseData horse:myHorse)
            {
                horses.add(horse);
                id.add(horse.getHorseID());
            }
            ArrayList<HorseData> horses_new = new ArrayList<>();
            ArrayList<Integer> id_new = new ArrayList<>();
            int size = id.size();

                try {
                    for (int j = 0; j < size; j++) {
                        int min = Collections.min(id);
                        int min_index = id.indexOf(min);
                        horses_new.add(horses.get(min_index));
                        id_new.add(id.get(min_index));
                        horses.remove(min_index);
                        id.remove(min_index);
                    }
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }

            ObservableList<HorseData> horses1 = FXCollections.observableArrayList(horses_new);


            BreedSortTable.setItems(horses1);
        }
    }

    @FXML
    void saveDataToFile(ActionEvent actionEvent) {
        File file = new File("D:\\C\\Desktop\\Uni Module\\Year 1\\Programming Fundamentals\\Java\\Java CW\\2330912_GihangaSandothmi\\javafxcw2\\javafxcw2\\src\\main\\resources\\com\\example\\javafxcw2\\horse.txt");
        if (myHorse.isEmpty()) {
            showMsgSave("Horse list is empty", false);
        }else {
            try {
                // Create a PrintWriter object to write the data to the chosen file
                PrintWriter save = new PrintWriter(file);
                // Iterate over the list of drivers and write each driver's data to the file
                for (HorseData horse : myHorse) {
                    save.write(horse.getHorseID() + "," + horse.getHorseName() + "," + horse.getHorseAge() + "," + horse.getJockeyName() + "," + horse.getGroup()+","+horse.getRaceRecord()+","+horse.getHorseBreed()+","+horse.getHorsePicture() + "\n");
                }
                // Close the PrintWriter object and show a success message if writing to the file is successful. otherwise, show an error message
                save.close();
                showMsgSave("Successfully wrote to the file.", true);
            } catch (IOException e) {
                showMsgSave("An error occurred.", false);
                e.printStackTrace();
            }
        }
    }


    private void showMsgAdd (String msg, boolean success){
        addMsgLabel.setText(msg);
        if (success){
            addMsgLabel.setStyle("-fx-text-fill: green;");
        }else {
            addMsgLabel.setStyle("-fx-text-fill: red;");
        }
    }

    private void showMsgUpdate (String msg, boolean success){
        updateMsgLabel.setText(msg);
        if (success){
            updateMsgLabel.setStyle("-fx-text-fill: green;");
        }else {
            updateMsgLabel.setStyle("-fx-text-fill: red;");
        }
    }

    private void showMsgDelete (String msg, boolean success){
        deleteMsgLabel.setText(msg);
        if (success){
            deleteMsgLabel.setStyle("-fx-text-fill: green;");
        }else {
            deleteMsgLabel.setStyle("-fx-text-fill: red;");
        }
    }

    private void showMsgVct (String msg, boolean success) {
        standingMsgLabel.setText(msg);
        if (success){
            standingMsgLabel.setStyle("-fx-text-fill: green;");
        }else {
            standingMsgLabel.setStyle("-fx-text-fill: red;");
        }
    }

    private void showMsgRandomRace (String msg, boolean success){
        randomRaceMsgLabel.setText(msg);
        if (success){
            randomRaceMsgLabel.setStyle("-fx-text-fill: green;");
        }else {
            randomRaceMsgLabel.setStyle("-fx-text-fill: red;");
        }
    }

    private void showMsgSave (String msg, boolean success) {
        saveDataMsgLabel.setText(msg);
        if (success){
            saveDataMsgLabel.setStyle("-fx-text-fill: green;");
        }else {
            saveDataMsgLabel.setStyle("-fx-text-fill: red;");
        }
    }


    private void showMsgVrl (String msg, boolean success) {
        vrlMsgLabel.setText(msg);
        if (success){
            vrlMsgLabel.setStyle("-fx-text-fill: green;");
        }else {
            vrlMsgLabel.setStyle("-fx-text-fill: red;");
        }
    }


    public void updateView (MouseEvent event) {

    }

    public void Clicks (ActionEvent actionEvent) {

        if (actionEvent.getSource() == addSubmitBtn) {
            managePane.toFront();
        }

        if (actionEvent.getSource() == manageBtn) {
            managePane.toFront();
        }
        if (actionEvent.getSource() == winningHorsesBtn) {
            standingPane.toFront();
        }
        if (actionEvent.getSource() == horseDetailsTableBtn) {
            raceTablePane.toFront();
        }

        if (actionEvent.getSource() == standingTableBtn) {
            standingPane.toFront();
        }

        if (actionEvent.getSource() == randomRaceBtn) {
            randomRacepane.toFront();
        }

        if (actionEvent.getSource() == raceTableBtn) {
            raceTablePane.toFront();
        }

        if (actionEvent.getSource() == saveDataBtn) {
            saveDataPane.toFront();
        }

        if (actionEvent.getSource() == loadDataBtn) {
            loadDataPane.toFront();
        }

        if (actionEvent.getSource() == menu) {
            menuPane.toFront();
        }
        if (actionEvent.getSource() == VisualizingBtn) {

            VisualizingPane.toFront();
            chart();
        }

        if (actionEvent.getSource() == addBtn) {
            addDetailsPane.toFront();
        }

        if (actionEvent.getSource() == updateBtn) {
            updateDetailsPane.toFront();
        }
        if (actionEvent.getSource() == majorRoundBtn) {
            randomRacepane.toFront();
        }

        if (actionEvent.getSource() == deleteBtn) {
            deleteDetailsPane.toFront();
        }
        if (actionEvent.getSource() == addBackBtn) {
            managePane.toFront();
        }
        if (actionEvent.getSource() == updateBackBtn) {
            managePane.toFront();
        }
        if (actionEvent.getSource() == deleteBack) {
            managePane.toFront();
        }

    }

    public void exit(MouseEvent event){

        System.exit(0);
    }
}
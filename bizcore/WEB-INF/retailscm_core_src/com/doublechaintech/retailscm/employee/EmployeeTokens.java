
package com.doublechaintech.retailscm.employee;
import com.doublechaintech.retailscm.CommonTokens;
import java.util.Map;
public class EmployeeTokens extends CommonTokens{

	static final String ALL="__all__"; //do not assign this to common users.
	static final String SELF="__self__";
	static final String OWNER_OBJECT_NAME="employee";
	
	public static boolean checkOptions(Map<String,Object> options, String optionToCheck){
		
		if(options==null){
 			return false; //completely no option here
 		}
 		if(options.containsKey(ALL)){
 			//danger, debug only, might load the entire database!, really terrible
 			return true;
 		}
		String ownerKey = getOwnerObjectKey();
		Object ownerObject =(String) options.get(ownerKey);
		if(ownerObject ==  null){
			return false;
		}
		if(!ownerObject.equals(OWNER_OBJECT_NAME)){ //is the owner? 
			return false; 
		}
		
 		if(options.containsKey(optionToCheck)){
 			//options.remove(optionToCheck);
 			//consume the key, can not use any more to extract the data with the same token.			
 			return true;
 		}
 		
 		return false;
	
	}
	protected EmployeeTokens(){
		//ensure not initialized outside the class
	}
	
	public EmployeeTokens merge(String [] tokens){
		this.parseTokens(tokens);
		return this;
	}
	
	public static EmployeeTokens mergeAll(String [] tokens){
		
		return allTokens().merge(tokens);
	}
	
	protected EmployeeTokens setOwnerObject(String objectName){
		ensureOptions();
		addSimpleOptions(getOwnerObjectKey(), objectName);
		return this;
	}
	
	
	public static EmployeeTokens start(){
		return new EmployeeTokens().setOwnerObject(OWNER_OBJECT_NAME);
	}
	
	protected static EmployeeTokens allTokens(){
		
		return start()
			.withCompany()
			.withDepartment()
			.withOccupation()
			.withResponsibleFor()
			.withCurrentSalaryGrade()
			.withJobApplication()
			.withProfessionInterview()
			.withHrInterview()
			.withOfferApproval()
			.withOfferAcceptance()
			.withEmployeeBoarding()
			.withTermination()
			.withEmployeeCompanyTrainingList()
			.withEmployeeSkillList()
			.withEmployeePerformanceList()
			.withEmployeeWorkExperienceList()
			.withEmployeeLeaveList()
			.withEmployeeInterviewList()
			.withEmployeeAttendanceList()
			.withEmployeeQualifierList()
			.withEmployeeEducationList()
			.withEmployeeAwardList()
			.withEmployeeSalarySheetList()
			.withPayingOffList();
	
	}
	public static EmployeeTokens withoutListsTokens(){
		
		return start()
			.withCompany()
			.withDepartment()
			.withOccupation()
			.withResponsibleFor()
			.withCurrentSalaryGrade()
			.withJobApplication()
			.withProfessionInterview()
			.withHrInterview()
			.withOfferApproval()
			.withOfferAcceptance()
			.withEmployeeBoarding()
			.withTermination();
	
	}
	
	public static Map <String,Object> all(){
		return allTokens().done();
	}
	public static Map <String,Object> withoutLists(){
		return withoutListsTokens().done();
	}
	public static Map <String,Object> empty(){
		return start().done();
	}

	protected static final String COMPANY = "company";
	public String getCompany(){
		return COMPANY;
	}
	public EmployeeTokens withCompany(){		
		addSimpleOptions(COMPANY);
		return this;
	}
	
	
	protected static final String DEPARTMENT = "department";
	public String getDepartment(){
		return DEPARTMENT;
	}
	public EmployeeTokens withDepartment(){		
		addSimpleOptions(DEPARTMENT);
		return this;
	}
	
	
	protected static final String OCCUPATION = "occupation";
	public String getOccupation(){
		return OCCUPATION;
	}
	public EmployeeTokens withOccupation(){		
		addSimpleOptions(OCCUPATION);
		return this;
	}
	
	
	protected static final String RESPONSIBLEFOR = "responsibleFor";
	public String getResponsibleFor(){
		return RESPONSIBLEFOR;
	}
	public EmployeeTokens withResponsibleFor(){		
		addSimpleOptions(RESPONSIBLEFOR);
		return this;
	}
	
	
	protected static final String CURRENTSALARYGRADE = "currentSalaryGrade";
	public String getCurrentSalaryGrade(){
		return CURRENTSALARYGRADE;
	}
	public EmployeeTokens withCurrentSalaryGrade(){		
		addSimpleOptions(CURRENTSALARYGRADE);
		return this;
	}
	
	
	protected static final String JOBAPPLICATION = "jobApplication";
	public String getJobApplication(){
		return JOBAPPLICATION;
	}
	public EmployeeTokens withJobApplication(){		
		addSimpleOptions(JOBAPPLICATION);
		return this;
	}
	
	
	protected static final String PROFESSIONINTERVIEW = "professionInterview";
	public String getProfessionInterview(){
		return PROFESSIONINTERVIEW;
	}
	public EmployeeTokens withProfessionInterview(){		
		addSimpleOptions(PROFESSIONINTERVIEW);
		return this;
	}
	
	
	protected static final String HRINTERVIEW = "hrInterview";
	public String getHrInterview(){
		return HRINTERVIEW;
	}
	public EmployeeTokens withHrInterview(){		
		addSimpleOptions(HRINTERVIEW);
		return this;
	}
	
	
	protected static final String OFFERAPPROVAL = "offerApproval";
	public String getOfferApproval(){
		return OFFERAPPROVAL;
	}
	public EmployeeTokens withOfferApproval(){		
		addSimpleOptions(OFFERAPPROVAL);
		return this;
	}
	
	
	protected static final String OFFERACCEPTANCE = "offerAcceptance";
	public String getOfferAcceptance(){
		return OFFERACCEPTANCE;
	}
	public EmployeeTokens withOfferAcceptance(){		
		addSimpleOptions(OFFERACCEPTANCE);
		return this;
	}
	
	
	protected static final String EMPLOYEEBOARDING = "employeeBoarding";
	public String getEmployeeBoarding(){
		return EMPLOYEEBOARDING;
	}
	public EmployeeTokens withEmployeeBoarding(){		
		addSimpleOptions(EMPLOYEEBOARDING);
		return this;
	}
	
	
	protected static final String TERMINATION = "termination";
	public String getTermination(){
		return TERMINATION;
	}
	public EmployeeTokens withTermination(){		
		addSimpleOptions(TERMINATION);
		return this;
	}
	
	
	protected static final String EMPLOYEE_COMPANY_TRAINING_LIST = "employeeCompanyTrainingList";
	public String getEmployeeCompanyTrainingList(){
		return EMPLOYEE_COMPANY_TRAINING_LIST;
	}
	public EmployeeTokens withEmployeeCompanyTrainingList(){		
		addSimpleOptions(EMPLOYEE_COMPANY_TRAINING_LIST);
		return this;
	}

	public EmployeeTokens extractMoreFromEmployeeCompanyTrainingList(String idsSeperatedWithComma){		
		addSimpleOptions(EMPLOYEE_COMPANY_TRAINING_LIST+".extractIds", idsSeperatedWithComma);
		return this;
	}
	
	
	
	
	private int employeeCompanyTrainingListSortCounter = 0;
	public EmployeeTokens sortEmployeeCompanyTrainingListWith(String field, String descOrAsc){		
		addSortMoreOptions(EMPLOYEE_COMPANY_TRAINING_LIST,employeeCompanyTrainingListSortCounter++, field, descOrAsc);
		return this;
	}
	private int employeeCompanyTrainingListSearchCounter = 0;
	public EmployeeTokens searchEmployeeCompanyTrainingListWith(String field, String verb, String value){		
		addSearchMoreOptions(EMPLOYEE_COMPANY_TRAINING_LIST,employeeCompanyTrainingListSearchCounter++, field, verb, value);
		return this;
	}
	
	public EmployeeTokens searchAllTextOfEmployeeCompanyTrainingList(String verb, String value){	
		String field = "id|currentStatus";
		addSearchMoreOptions(EMPLOYEE_COMPANY_TRAINING_LIST,employeeCompanyTrainingListSearchCounter++, field, verb, value);
		return this;
	}
	
	
	
	public EmployeeTokens rowsPerPageOfEmployeeCompanyTrainingList(int rowsPerPage){		
		addSimpleOptions(EMPLOYEE_COMPANY_TRAINING_LIST+"RowsPerPage",rowsPerPage);
		return this;
	}
	public EmployeeTokens currentPageNumberOfEmployeeCompanyTrainingList(int currentPageNumber){		
		addSimpleOptions(EMPLOYEE_COMPANY_TRAINING_LIST+"CurrentPage",currentPageNumber);
		return this;
	}
	public EmployeeTokens retainColumnsOfEmployeeCompanyTrainingList(String[] columns){		
		addSimpleOptions(EMPLOYEE_COMPANY_TRAINING_LIST+"RetainColumns",columns);
		return this;
	}
	public EmployeeTokens excludeColumnsOfEmployeeCompanyTrainingList(String[] columns){		
		addSimpleOptions(EMPLOYEE_COMPANY_TRAINING_LIST+"ExcludeColumns",columns);
		return this;
	}
	
	
		
	protected static final String EMPLOYEE_SKILL_LIST = "employeeSkillList";
	public String getEmployeeSkillList(){
		return EMPLOYEE_SKILL_LIST;
	}
	public EmployeeTokens withEmployeeSkillList(){		
		addSimpleOptions(EMPLOYEE_SKILL_LIST);
		return this;
	}

	public EmployeeTokens extractMoreFromEmployeeSkillList(String idsSeperatedWithComma){		
		addSimpleOptions(EMPLOYEE_SKILL_LIST+".extractIds", idsSeperatedWithComma);
		return this;
	}
	
	
	
	
	private int employeeSkillListSortCounter = 0;
	public EmployeeTokens sortEmployeeSkillListWith(String field, String descOrAsc){		
		addSortMoreOptions(EMPLOYEE_SKILL_LIST,employeeSkillListSortCounter++, field, descOrAsc);
		return this;
	}
	private int employeeSkillListSearchCounter = 0;
	public EmployeeTokens searchEmployeeSkillListWith(String field, String verb, String value){		
		addSearchMoreOptions(EMPLOYEE_SKILL_LIST,employeeSkillListSearchCounter++, field, verb, value);
		return this;
	}
	
	public EmployeeTokens searchAllTextOfEmployeeSkillList(String verb, String value){	
		String field = "id|description";
		addSearchMoreOptions(EMPLOYEE_SKILL_LIST,employeeSkillListSearchCounter++, field, verb, value);
		return this;
	}
	
	
	
	public EmployeeTokens rowsPerPageOfEmployeeSkillList(int rowsPerPage){		
		addSimpleOptions(EMPLOYEE_SKILL_LIST+"RowsPerPage",rowsPerPage);
		return this;
	}
	public EmployeeTokens currentPageNumberOfEmployeeSkillList(int currentPageNumber){		
		addSimpleOptions(EMPLOYEE_SKILL_LIST+"CurrentPage",currentPageNumber);
		return this;
	}
	public EmployeeTokens retainColumnsOfEmployeeSkillList(String[] columns){		
		addSimpleOptions(EMPLOYEE_SKILL_LIST+"RetainColumns",columns);
		return this;
	}
	public EmployeeTokens excludeColumnsOfEmployeeSkillList(String[] columns){		
		addSimpleOptions(EMPLOYEE_SKILL_LIST+"ExcludeColumns",columns);
		return this;
	}
	
	
		
	protected static final String EMPLOYEE_PERFORMANCE_LIST = "employeePerformanceList";
	public String getEmployeePerformanceList(){
		return EMPLOYEE_PERFORMANCE_LIST;
	}
	public EmployeeTokens withEmployeePerformanceList(){		
		addSimpleOptions(EMPLOYEE_PERFORMANCE_LIST);
		return this;
	}

	public EmployeeTokens extractMoreFromEmployeePerformanceList(String idsSeperatedWithComma){		
		addSimpleOptions(EMPLOYEE_PERFORMANCE_LIST+".extractIds", idsSeperatedWithComma);
		return this;
	}
	
	
	
	
	private int employeePerformanceListSortCounter = 0;
	public EmployeeTokens sortEmployeePerformanceListWith(String field, String descOrAsc){		
		addSortMoreOptions(EMPLOYEE_PERFORMANCE_LIST,employeePerformanceListSortCounter++, field, descOrAsc);
		return this;
	}
	private int employeePerformanceListSearchCounter = 0;
	public EmployeeTokens searchEmployeePerformanceListWith(String field, String verb, String value){		
		addSearchMoreOptions(EMPLOYEE_PERFORMANCE_LIST,employeePerformanceListSearchCounter++, field, verb, value);
		return this;
	}
	
	public EmployeeTokens searchAllTextOfEmployeePerformanceList(String verb, String value){	
		String field = "id|performanceComment";
		addSearchMoreOptions(EMPLOYEE_PERFORMANCE_LIST,employeePerformanceListSearchCounter++, field, verb, value);
		return this;
	}
	
	
	
	public EmployeeTokens rowsPerPageOfEmployeePerformanceList(int rowsPerPage){		
		addSimpleOptions(EMPLOYEE_PERFORMANCE_LIST+"RowsPerPage",rowsPerPage);
		return this;
	}
	public EmployeeTokens currentPageNumberOfEmployeePerformanceList(int currentPageNumber){		
		addSimpleOptions(EMPLOYEE_PERFORMANCE_LIST+"CurrentPage",currentPageNumber);
		return this;
	}
	public EmployeeTokens retainColumnsOfEmployeePerformanceList(String[] columns){		
		addSimpleOptions(EMPLOYEE_PERFORMANCE_LIST+"RetainColumns",columns);
		return this;
	}
	public EmployeeTokens excludeColumnsOfEmployeePerformanceList(String[] columns){		
		addSimpleOptions(EMPLOYEE_PERFORMANCE_LIST+"ExcludeColumns",columns);
		return this;
	}
	
	
		
	protected static final String EMPLOYEE_WORK_EXPERIENCE_LIST = "employeeWorkExperienceList";
	public String getEmployeeWorkExperienceList(){
		return EMPLOYEE_WORK_EXPERIENCE_LIST;
	}
	public EmployeeTokens withEmployeeWorkExperienceList(){		
		addSimpleOptions(EMPLOYEE_WORK_EXPERIENCE_LIST);
		return this;
	}

	public EmployeeTokens extractMoreFromEmployeeWorkExperienceList(String idsSeperatedWithComma){		
		addSimpleOptions(EMPLOYEE_WORK_EXPERIENCE_LIST+".extractIds", idsSeperatedWithComma);
		return this;
	}
	
	
	
	
	private int employeeWorkExperienceListSortCounter = 0;
	public EmployeeTokens sortEmployeeWorkExperienceListWith(String field, String descOrAsc){		
		addSortMoreOptions(EMPLOYEE_WORK_EXPERIENCE_LIST,employeeWorkExperienceListSortCounter++, field, descOrAsc);
		return this;
	}
	private int employeeWorkExperienceListSearchCounter = 0;
	public EmployeeTokens searchEmployeeWorkExperienceListWith(String field, String verb, String value){		
		addSearchMoreOptions(EMPLOYEE_WORK_EXPERIENCE_LIST,employeeWorkExperienceListSearchCounter++, field, verb, value);
		return this;
	}
	
	public EmployeeTokens searchAllTextOfEmployeeWorkExperienceList(String verb, String value){	
		String field = "id|company|description";
		addSearchMoreOptions(EMPLOYEE_WORK_EXPERIENCE_LIST,employeeWorkExperienceListSearchCounter++, field, verb, value);
		return this;
	}
	
	
	
	public EmployeeTokens rowsPerPageOfEmployeeWorkExperienceList(int rowsPerPage){		
		addSimpleOptions(EMPLOYEE_WORK_EXPERIENCE_LIST+"RowsPerPage",rowsPerPage);
		return this;
	}
	public EmployeeTokens currentPageNumberOfEmployeeWorkExperienceList(int currentPageNumber){		
		addSimpleOptions(EMPLOYEE_WORK_EXPERIENCE_LIST+"CurrentPage",currentPageNumber);
		return this;
	}
	public EmployeeTokens retainColumnsOfEmployeeWorkExperienceList(String[] columns){		
		addSimpleOptions(EMPLOYEE_WORK_EXPERIENCE_LIST+"RetainColumns",columns);
		return this;
	}
	public EmployeeTokens excludeColumnsOfEmployeeWorkExperienceList(String[] columns){		
		addSimpleOptions(EMPLOYEE_WORK_EXPERIENCE_LIST+"ExcludeColumns",columns);
		return this;
	}
	
	
		
	protected static final String EMPLOYEE_LEAVE_LIST = "employeeLeaveList";
	public String getEmployeeLeaveList(){
		return EMPLOYEE_LEAVE_LIST;
	}
	public EmployeeTokens withEmployeeLeaveList(){		
		addSimpleOptions(EMPLOYEE_LEAVE_LIST);
		return this;
	}

	public EmployeeTokens extractMoreFromEmployeeLeaveList(String idsSeperatedWithComma){		
		addSimpleOptions(EMPLOYEE_LEAVE_LIST+".extractIds", idsSeperatedWithComma);
		return this;
	}
	
	
	
	
	private int employeeLeaveListSortCounter = 0;
	public EmployeeTokens sortEmployeeLeaveListWith(String field, String descOrAsc){		
		addSortMoreOptions(EMPLOYEE_LEAVE_LIST,employeeLeaveListSortCounter++, field, descOrAsc);
		return this;
	}
	private int employeeLeaveListSearchCounter = 0;
	public EmployeeTokens searchEmployeeLeaveListWith(String field, String verb, String value){		
		addSearchMoreOptions(EMPLOYEE_LEAVE_LIST,employeeLeaveListSearchCounter++, field, verb, value);
		return this;
	}
	
	public EmployeeTokens searchAllTextOfEmployeeLeaveList(String verb, String value){	
		String field = "id|remark";
		addSearchMoreOptions(EMPLOYEE_LEAVE_LIST,employeeLeaveListSearchCounter++, field, verb, value);
		return this;
	}
	
	
	
	public EmployeeTokens rowsPerPageOfEmployeeLeaveList(int rowsPerPage){		
		addSimpleOptions(EMPLOYEE_LEAVE_LIST+"RowsPerPage",rowsPerPage);
		return this;
	}
	public EmployeeTokens currentPageNumberOfEmployeeLeaveList(int currentPageNumber){		
		addSimpleOptions(EMPLOYEE_LEAVE_LIST+"CurrentPage",currentPageNumber);
		return this;
	}
	public EmployeeTokens retainColumnsOfEmployeeLeaveList(String[] columns){		
		addSimpleOptions(EMPLOYEE_LEAVE_LIST+"RetainColumns",columns);
		return this;
	}
	public EmployeeTokens excludeColumnsOfEmployeeLeaveList(String[] columns){		
		addSimpleOptions(EMPLOYEE_LEAVE_LIST+"ExcludeColumns",columns);
		return this;
	}
	
	
		
	protected static final String EMPLOYEE_INTERVIEW_LIST = "employeeInterviewList";
	public String getEmployeeInterviewList(){
		return EMPLOYEE_INTERVIEW_LIST;
	}
	public EmployeeTokens withEmployeeInterviewList(){		
		addSimpleOptions(EMPLOYEE_INTERVIEW_LIST);
		return this;
	}

	public EmployeeTokens extractMoreFromEmployeeInterviewList(String idsSeperatedWithComma){		
		addSimpleOptions(EMPLOYEE_INTERVIEW_LIST+".extractIds", idsSeperatedWithComma);
		return this;
	}
	
	
	
	
	private int employeeInterviewListSortCounter = 0;
	public EmployeeTokens sortEmployeeInterviewListWith(String field, String descOrAsc){		
		addSortMoreOptions(EMPLOYEE_INTERVIEW_LIST,employeeInterviewListSortCounter++, field, descOrAsc);
		return this;
	}
	private int employeeInterviewListSearchCounter = 0;
	public EmployeeTokens searchEmployeeInterviewListWith(String field, String verb, String value){		
		addSearchMoreOptions(EMPLOYEE_INTERVIEW_LIST,employeeInterviewListSearchCounter++, field, verb, value);
		return this;
	}
	
	public EmployeeTokens searchAllTextOfEmployeeInterviewList(String verb, String value){	
		String field = "id|remark";
		addSearchMoreOptions(EMPLOYEE_INTERVIEW_LIST,employeeInterviewListSearchCounter++, field, verb, value);
		return this;
	}
	
	
	
	public EmployeeTokens rowsPerPageOfEmployeeInterviewList(int rowsPerPage){		
		addSimpleOptions(EMPLOYEE_INTERVIEW_LIST+"RowsPerPage",rowsPerPage);
		return this;
	}
	public EmployeeTokens currentPageNumberOfEmployeeInterviewList(int currentPageNumber){		
		addSimpleOptions(EMPLOYEE_INTERVIEW_LIST+"CurrentPage",currentPageNumber);
		return this;
	}
	public EmployeeTokens retainColumnsOfEmployeeInterviewList(String[] columns){		
		addSimpleOptions(EMPLOYEE_INTERVIEW_LIST+"RetainColumns",columns);
		return this;
	}
	public EmployeeTokens excludeColumnsOfEmployeeInterviewList(String[] columns){		
		addSimpleOptions(EMPLOYEE_INTERVIEW_LIST+"ExcludeColumns",columns);
		return this;
	}
	
	
		
	protected static final String EMPLOYEE_ATTENDANCE_LIST = "employeeAttendanceList";
	public String getEmployeeAttendanceList(){
		return EMPLOYEE_ATTENDANCE_LIST;
	}
	public EmployeeTokens withEmployeeAttendanceList(){		
		addSimpleOptions(EMPLOYEE_ATTENDANCE_LIST);
		return this;
	}

	public EmployeeTokens extractMoreFromEmployeeAttendanceList(String idsSeperatedWithComma){		
		addSimpleOptions(EMPLOYEE_ATTENDANCE_LIST+".extractIds", idsSeperatedWithComma);
		return this;
	}
	
	
	
	
	private int employeeAttendanceListSortCounter = 0;
	public EmployeeTokens sortEmployeeAttendanceListWith(String field, String descOrAsc){		
		addSortMoreOptions(EMPLOYEE_ATTENDANCE_LIST,employeeAttendanceListSortCounter++, field, descOrAsc);
		return this;
	}
	private int employeeAttendanceListSearchCounter = 0;
	public EmployeeTokens searchEmployeeAttendanceListWith(String field, String verb, String value){		
		addSearchMoreOptions(EMPLOYEE_ATTENDANCE_LIST,employeeAttendanceListSearchCounter++, field, verb, value);
		return this;
	}
	
	public EmployeeTokens searchAllTextOfEmployeeAttendanceList(String verb, String value){	
		String field = "id|remark";
		addSearchMoreOptions(EMPLOYEE_ATTENDANCE_LIST,employeeAttendanceListSearchCounter++, field, verb, value);
		return this;
	}
	
	
	
	public EmployeeTokens rowsPerPageOfEmployeeAttendanceList(int rowsPerPage){		
		addSimpleOptions(EMPLOYEE_ATTENDANCE_LIST+"RowsPerPage",rowsPerPage);
		return this;
	}
	public EmployeeTokens currentPageNumberOfEmployeeAttendanceList(int currentPageNumber){		
		addSimpleOptions(EMPLOYEE_ATTENDANCE_LIST+"CurrentPage",currentPageNumber);
		return this;
	}
	public EmployeeTokens retainColumnsOfEmployeeAttendanceList(String[] columns){		
		addSimpleOptions(EMPLOYEE_ATTENDANCE_LIST+"RetainColumns",columns);
		return this;
	}
	public EmployeeTokens excludeColumnsOfEmployeeAttendanceList(String[] columns){		
		addSimpleOptions(EMPLOYEE_ATTENDANCE_LIST+"ExcludeColumns",columns);
		return this;
	}
	
	
		
	protected static final String EMPLOYEE_QUALIFIER_LIST = "employeeQualifierList";
	public String getEmployeeQualifierList(){
		return EMPLOYEE_QUALIFIER_LIST;
	}
	public EmployeeTokens withEmployeeQualifierList(){		
		addSimpleOptions(EMPLOYEE_QUALIFIER_LIST);
		return this;
	}

	public EmployeeTokens extractMoreFromEmployeeQualifierList(String idsSeperatedWithComma){		
		addSimpleOptions(EMPLOYEE_QUALIFIER_LIST+".extractIds", idsSeperatedWithComma);
		return this;
	}
	
	
	
	
	private int employeeQualifierListSortCounter = 0;
	public EmployeeTokens sortEmployeeQualifierListWith(String field, String descOrAsc){		
		addSortMoreOptions(EMPLOYEE_QUALIFIER_LIST,employeeQualifierListSortCounter++, field, descOrAsc);
		return this;
	}
	private int employeeQualifierListSearchCounter = 0;
	public EmployeeTokens searchEmployeeQualifierListWith(String field, String verb, String value){		
		addSearchMoreOptions(EMPLOYEE_QUALIFIER_LIST,employeeQualifierListSearchCounter++, field, verb, value);
		return this;
	}
	
	public EmployeeTokens searchAllTextOfEmployeeQualifierList(String verb, String value){	
		String field = "id|type|level|remark";
		addSearchMoreOptions(EMPLOYEE_QUALIFIER_LIST,employeeQualifierListSearchCounter++, field, verb, value);
		return this;
	}
	
	
	
	public EmployeeTokens rowsPerPageOfEmployeeQualifierList(int rowsPerPage){		
		addSimpleOptions(EMPLOYEE_QUALIFIER_LIST+"RowsPerPage",rowsPerPage);
		return this;
	}
	public EmployeeTokens currentPageNumberOfEmployeeQualifierList(int currentPageNumber){		
		addSimpleOptions(EMPLOYEE_QUALIFIER_LIST+"CurrentPage",currentPageNumber);
		return this;
	}
	public EmployeeTokens retainColumnsOfEmployeeQualifierList(String[] columns){		
		addSimpleOptions(EMPLOYEE_QUALIFIER_LIST+"RetainColumns",columns);
		return this;
	}
	public EmployeeTokens excludeColumnsOfEmployeeQualifierList(String[] columns){		
		addSimpleOptions(EMPLOYEE_QUALIFIER_LIST+"ExcludeColumns",columns);
		return this;
	}
	
	
		
	protected static final String EMPLOYEE_EDUCATION_LIST = "employeeEducationList";
	public String getEmployeeEducationList(){
		return EMPLOYEE_EDUCATION_LIST;
	}
	public EmployeeTokens withEmployeeEducationList(){		
		addSimpleOptions(EMPLOYEE_EDUCATION_LIST);
		return this;
	}

	public EmployeeTokens extractMoreFromEmployeeEducationList(String idsSeperatedWithComma){		
		addSimpleOptions(EMPLOYEE_EDUCATION_LIST+".extractIds", idsSeperatedWithComma);
		return this;
	}
	
	
	
	
	private int employeeEducationListSortCounter = 0;
	public EmployeeTokens sortEmployeeEducationListWith(String field, String descOrAsc){		
		addSortMoreOptions(EMPLOYEE_EDUCATION_LIST,employeeEducationListSortCounter++, field, descOrAsc);
		return this;
	}
	private int employeeEducationListSearchCounter = 0;
	public EmployeeTokens searchEmployeeEducationListWith(String field, String verb, String value){		
		addSearchMoreOptions(EMPLOYEE_EDUCATION_LIST,employeeEducationListSearchCounter++, field, verb, value);
		return this;
	}
	
	public EmployeeTokens searchAllTextOfEmployeeEducationList(String verb, String value){	
		String field = "id|type|remark";
		addSearchMoreOptions(EMPLOYEE_EDUCATION_LIST,employeeEducationListSearchCounter++, field, verb, value);
		return this;
	}
	
	
	
	public EmployeeTokens rowsPerPageOfEmployeeEducationList(int rowsPerPage){		
		addSimpleOptions(EMPLOYEE_EDUCATION_LIST+"RowsPerPage",rowsPerPage);
		return this;
	}
	public EmployeeTokens currentPageNumberOfEmployeeEducationList(int currentPageNumber){		
		addSimpleOptions(EMPLOYEE_EDUCATION_LIST+"CurrentPage",currentPageNumber);
		return this;
	}
	public EmployeeTokens retainColumnsOfEmployeeEducationList(String[] columns){		
		addSimpleOptions(EMPLOYEE_EDUCATION_LIST+"RetainColumns",columns);
		return this;
	}
	public EmployeeTokens excludeColumnsOfEmployeeEducationList(String[] columns){		
		addSimpleOptions(EMPLOYEE_EDUCATION_LIST+"ExcludeColumns",columns);
		return this;
	}
	
	
		
	protected static final String EMPLOYEE_AWARD_LIST = "employeeAwardList";
	public String getEmployeeAwardList(){
		return EMPLOYEE_AWARD_LIST;
	}
	public EmployeeTokens withEmployeeAwardList(){		
		addSimpleOptions(EMPLOYEE_AWARD_LIST);
		return this;
	}

	public EmployeeTokens extractMoreFromEmployeeAwardList(String idsSeperatedWithComma){		
		addSimpleOptions(EMPLOYEE_AWARD_LIST+".extractIds", idsSeperatedWithComma);
		return this;
	}
	
	
	
	
	private int employeeAwardListSortCounter = 0;
	public EmployeeTokens sortEmployeeAwardListWith(String field, String descOrAsc){		
		addSortMoreOptions(EMPLOYEE_AWARD_LIST,employeeAwardListSortCounter++, field, descOrAsc);
		return this;
	}
	private int employeeAwardListSearchCounter = 0;
	public EmployeeTokens searchEmployeeAwardListWith(String field, String verb, String value){		
		addSearchMoreOptions(EMPLOYEE_AWARD_LIST,employeeAwardListSearchCounter++, field, verb, value);
		return this;
	}
	
	public EmployeeTokens searchAllTextOfEmployeeAwardList(String verb, String value){	
		String field = "id|type|remark";
		addSearchMoreOptions(EMPLOYEE_AWARD_LIST,employeeAwardListSearchCounter++, field, verb, value);
		return this;
	}
	
	
	
	public EmployeeTokens rowsPerPageOfEmployeeAwardList(int rowsPerPage){		
		addSimpleOptions(EMPLOYEE_AWARD_LIST+"RowsPerPage",rowsPerPage);
		return this;
	}
	public EmployeeTokens currentPageNumberOfEmployeeAwardList(int currentPageNumber){		
		addSimpleOptions(EMPLOYEE_AWARD_LIST+"CurrentPage",currentPageNumber);
		return this;
	}
	public EmployeeTokens retainColumnsOfEmployeeAwardList(String[] columns){		
		addSimpleOptions(EMPLOYEE_AWARD_LIST+"RetainColumns",columns);
		return this;
	}
	public EmployeeTokens excludeColumnsOfEmployeeAwardList(String[] columns){		
		addSimpleOptions(EMPLOYEE_AWARD_LIST+"ExcludeColumns",columns);
		return this;
	}
	
	
		
	protected static final String EMPLOYEE_SALARY_SHEET_LIST = "employeeSalarySheetList";
	public String getEmployeeSalarySheetList(){
		return EMPLOYEE_SALARY_SHEET_LIST;
	}
	public EmployeeTokens withEmployeeSalarySheetList(){		
		addSimpleOptions(EMPLOYEE_SALARY_SHEET_LIST);
		return this;
	}

	public EmployeeTokens extractMoreFromEmployeeSalarySheetList(String idsSeperatedWithComma){		
		addSimpleOptions(EMPLOYEE_SALARY_SHEET_LIST+".extractIds", idsSeperatedWithComma);
		return this;
	}
	
	
	
	
	private int employeeSalarySheetListSortCounter = 0;
	public EmployeeTokens sortEmployeeSalarySheetListWith(String field, String descOrAsc){		
		addSortMoreOptions(EMPLOYEE_SALARY_SHEET_LIST,employeeSalarySheetListSortCounter++, field, descOrAsc);
		return this;
	}
	private int employeeSalarySheetListSearchCounter = 0;
	public EmployeeTokens searchEmployeeSalarySheetListWith(String field, String verb, String value){		
		addSearchMoreOptions(EMPLOYEE_SALARY_SHEET_LIST,employeeSalarySheetListSearchCounter++, field, verb, value);
		return this;
	}
	
	public EmployeeTokens searchAllTextOfEmployeeSalarySheetList(String verb, String value){	
		String field = "id|currentStatus";
		addSearchMoreOptions(EMPLOYEE_SALARY_SHEET_LIST,employeeSalarySheetListSearchCounter++, field, verb, value);
		return this;
	}
	
	
	
	public EmployeeTokens rowsPerPageOfEmployeeSalarySheetList(int rowsPerPage){		
		addSimpleOptions(EMPLOYEE_SALARY_SHEET_LIST+"RowsPerPage",rowsPerPage);
		return this;
	}
	public EmployeeTokens currentPageNumberOfEmployeeSalarySheetList(int currentPageNumber){		
		addSimpleOptions(EMPLOYEE_SALARY_SHEET_LIST+"CurrentPage",currentPageNumber);
		return this;
	}
	public EmployeeTokens retainColumnsOfEmployeeSalarySheetList(String[] columns){		
		addSimpleOptions(EMPLOYEE_SALARY_SHEET_LIST+"RetainColumns",columns);
		return this;
	}
	public EmployeeTokens excludeColumnsOfEmployeeSalarySheetList(String[] columns){		
		addSimpleOptions(EMPLOYEE_SALARY_SHEET_LIST+"ExcludeColumns",columns);
		return this;
	}
	
	
		
	protected static final String PAYING_OFF_LIST = "payingOffList";
	public String getPayingOffList(){
		return PAYING_OFF_LIST;
	}
	public EmployeeTokens withPayingOffList(){		
		addSimpleOptions(PAYING_OFF_LIST);
		return this;
	}

	public EmployeeTokens extractMoreFromPayingOffList(String idsSeperatedWithComma){		
		addSimpleOptions(PAYING_OFF_LIST+".extractIds", idsSeperatedWithComma);
		return this;
	}
	
	
	
	
	private int payingOffListSortCounter = 0;
	public EmployeeTokens sortPayingOffListWith(String field, String descOrAsc){		
		addSortMoreOptions(PAYING_OFF_LIST,payingOffListSortCounter++, field, descOrAsc);
		return this;
	}
	private int payingOffListSearchCounter = 0;
	public EmployeeTokens searchPayingOffListWith(String field, String verb, String value){		
		addSearchMoreOptions(PAYING_OFF_LIST,payingOffListSearchCounter++, field, verb, value);
		return this;
	}
	
	public EmployeeTokens searchAllTextOfPayingOffList(String verb, String value){	
		String field = "id|who";
		addSearchMoreOptions(PAYING_OFF_LIST,payingOffListSearchCounter++, field, verb, value);
		return this;
	}
	
	
	
	public EmployeeTokens rowsPerPageOfPayingOffList(int rowsPerPage){		
		addSimpleOptions(PAYING_OFF_LIST+"RowsPerPage",rowsPerPage);
		return this;
	}
	public EmployeeTokens currentPageNumberOfPayingOffList(int currentPageNumber){		
		addSimpleOptions(PAYING_OFF_LIST+"CurrentPage",currentPageNumber);
		return this;
	}
	public EmployeeTokens retainColumnsOfPayingOffList(String[] columns){		
		addSimpleOptions(PAYING_OFF_LIST+"RetainColumns",columns);
		return this;
	}
	public EmployeeTokens excludeColumnsOfPayingOffList(String[] columns){		
		addSimpleOptions(PAYING_OFF_LIST+"ExcludeColumns",columns);
		return this;
	}
	
	
		
	
	public  EmployeeTokens searchEntireObjectText(String verb, String value){
		
		searchAllTextOfEmployeeCompanyTrainingList(verb, value);	
		searchAllTextOfEmployeeSkillList(verb, value);	
		searchAllTextOfEmployeePerformanceList(verb, value);	
		searchAllTextOfEmployeeWorkExperienceList(verb, value);	
		searchAllTextOfEmployeeLeaveList(verb, value);	
		searchAllTextOfEmployeeInterviewList(verb, value);	
		searchAllTextOfEmployeeAttendanceList(verb, value);	
		searchAllTextOfEmployeeQualifierList(verb, value);	
		searchAllTextOfEmployeeEducationList(verb, value);	
		searchAllTextOfEmployeeAwardList(verb, value);	
		searchAllTextOfEmployeeSalarySheetList(verb, value);	
		searchAllTextOfPayingOffList(verb, value);	
		return this;
	}
}


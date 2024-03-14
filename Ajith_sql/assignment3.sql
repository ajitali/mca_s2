-- .................question_3..........................
-- select student.name ,course.course_name,grade.grade from grade 
-- inner join student on student.student_no=grade.student_no
-- inner join section on grade.section_identifier=section.section_identifier 
-- inner join course on section.course_no=course.course_no where student.name="smith";
-- ....................question_4..............
-- select student.name,grade.grade from student 
-- inner join grade on student.student_no=grade.student_no
-- inner join section on grade.section_identifier=section.section_identifier 
-- inner join course on section.course_no=course.course_no 
-- where course.course_name="Database" and section.semester="fall";
-- ....................question_5......................
-- select course.course_name from course where course.course_no in(
--  select prerequisite.prerequisite_no from prerequisite 
--  inner join course on prerequisite.course_no=course.course_no
--  where course.course_no in(select course.course_no from course where course_name="Database"));

-- .............question_6...................
 create view student_view as select name from student where major="CS";
 
-- ....................question_7.................
--  select course_name from course where course_no in(
--  select course_no from section where instructor="King");

-- ................question_8....................
-- select section.course_no,section.semester,section.year,
-- count(grade.student_no) as no_of_students from section 
-- inner join grade on section.section_identifier=grade.section_identifier
-- where section.instructor="king" group by section.section_identifier;

-- ...................question_9............
 -- select student.name ,course.course_no,course.course_name,course.credit_hours,
--  section.semester,section.year,grade.grade from student 
--  inner join grade on grade.student_no=student.student_no
--  inner join section on grade.section_identifier=section.section_identifier 
--  inner join course on section.course_no=course.course_no
--  where student.class=4 and major="CS";
 
-- ................question_10.............
-- insert into student values("Johnson",25,1,"Math");

-- set sql_safe_updates=0;
-- update student set class=2 where name="Smith";
-- set sql_safe_updates=1;

-- insert into course values("Knowledge engineering","CS4390",3,"CS");

-- delete from student where student_no=17; 

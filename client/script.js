const tableBodyEl = document.getElementById("tableBodyContanier");
const enrolledTableBody = document.getElementById("enrolledTableBodyContanier");

window.addEventListener('load', () => {
    showCourse();
    enrolledTableBodyContanier();
});

function showCourse() {
    fetch("http://localhost:8080/courses")
        .then((res) => res.json())
        .then((data) => {
            data.forEach((course) => {
                const tr = document.createElement("tr");

                const tdId = document.createElement("td");
                tdId.textContent = course.courseId;
                tr.appendChild(tdId);

                const tdName = document.createElement("td");
                tdName.textContent = course.courseName;
                tr.appendChild(tdName);

                const tdTrainer = document.createElement("td");
                tdTrainer.textContent = course.trainer;
                tr.appendChild(tdTrainer);

                const tdDuration = document.createElement("td");
                tdDuration.textContent = course.durationInWeek;
                tr.appendChild(tdDuration);

                tableBodyEl.appendChild(tr);
            });
        });
};

function enrolledTableBodyContanier(){
    fetch("http://localhost:8080/admin/courses-enrolled")
        .then((res) => res.json())
        .then((data) => {
            data.forEach((course) => {
                const tr = document.createElement("tr");

                const tdName = document.createElement("td");
                tdName.textContent = course.name;
                tr.appendChild(tdName);

                const tdEmailId = document.createElement("td");
                tdEmailId.textContent = course.emailId;
                tr.appendChild(tdEmailId);

                const tdCourseName = document.createElement("td");
                tdCourseName.textContent = course.courseName;
                tr.appendChild(tdCourseName);

                enrolledTableBody.appendChild(tr);
            });
        });
}

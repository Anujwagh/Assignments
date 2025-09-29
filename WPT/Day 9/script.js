document.getElementById("loadDataBtn").addEventListener("click", function () {
  fetch("https://jsonplaceholder.typicode.com/posts")
    .then(response => {
      if (!response.ok) {
        throw new Error("Network response was not ok");
      }
      return response.json();
    })
    .then(posts => {
      const tableBody = document.getElementById("tableBody");
      tableBody.innerHTML = ""; // Clear old data if any

      posts.forEach(post => {
        const row = document.createElement("tr");

        const idCell = document.createElement("td");
        idCell.textContent = post.id;

        const titleCell = document.createElement("td");
        titleCell.textContent = post.title;

        row.appendChild(idCell);
        row.appendChild(titleCell);
        tableBody.appendChild(row);
      });

      document.getElementById("dataTable").style.display = "table";
    })
    .catch(error => {
      console.error("Fetch error:", error);
    });
});

document.getElementById("fetchBtn").addEventListener("click", function () {
  const id = document.getElementById("postId").value.trim();
  const errorDiv = document.getElementById("error");
  const table = document.getElementById("postTable");
  const tbody = document.getElementById("postBody");

  // Clear previous data
  errorDiv.textContent = "";
  tbody.innerHTML = "";
  table.style.display = "none";

  // Validate input
  if (!id || isNaN(id) || id < 1 || id > 100) {
    errorDiv.textContent = "Please enter a valid Post ID between 1 and 100.";
    return;
  }

  fetch(`https://jsonplaceholder.typicode.com/posts/${id}`)
    .then(response => {
      if (!response.ok) {
        throw new Error("Post not found.");
      }
      return response.json();
    })
    .then(post => {
      const row = document.createElement("tr");

      const idCell = document.createElement("td");
      idCell.textContent = post.id;

      const titleCell = document.createElement("td");
      titleCell.textContent = post.title;

      row.appendChild(idCell);
      row.appendChild(titleCell);
      tbody.appendChild(row);

      table.style.display = "table";
    })
    .catch(error => {
      errorDiv.textContent = "Error fetching post: " + error.message;
    });
});

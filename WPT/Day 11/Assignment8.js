function displayCurrentDate(times) {
  for (let i = 0; i < times; i++) {
    const now = new Date();

    const dd = String(now.getDate()).padStart(2, '0');
    const mm = String(now.getMonth() + 1).padStart(2, '0'); 
    const yyyy = now.getFullYear();

    const formattedDate = `${dd}-${mm}-${yyyy}`;
    console.log(formattedDate);
  }
}

displayCurrentDate(1);

const ctx = document.getElementById("myChart").getContext("2d");
const myChart = new Chart(ctx, {
  type: "line",
  data: {
    labels: [
      "1월",
      "2월",
      "3월",
      "4월",
      "5월",
      "6월",
      "7월",
      "8월",
      "9월",
      "10월",
      "11월",
      "12월",
    ],
    datasets: [
      {
        label: "월별 회원가입",
        data: [
	
	// db에 있는 데이터 넣어야할  곳
          2000, 5000, 4000, 3000, 2000, 1000, 1000, 1000, 1000, 1000, 1000,
          1000,

        ],
        backgroundColor: [
          "rgba(255, 99, 132, 0.2)",
          "rgba(54, 162, 235, 0.2)",
          "rgba(255, 206, 86, 0.2)",
          "rgba(75, 192, 192, 0.2)",
          "rgba(153, 102, 255, 0.2)",
          "rgba(255, 159, 64, 0.2)",
          "rgba(255, 159, 64, 0.2)",
        ],
        borderColor: [
          "rgba(255, 99, 132, 1)",
          "rgba(54, 162, 235, 1)",
          "rgba(255, 206, 86, 1)",
          "rgba(75, 192, 192, 1)",
          "rgba(153, 102, 255, 1)",
          "rgba(255, 159, 64, 1)",
          "rgba(255, 159, 64, 0.2)",
        ],
        borderWidth: 1,
      },
    ],
  },
  options: {
    scales: {
      y: {
        beginAtZero: true,
      },
    },
  },
});

const cax = document.getElementById("mycate").getContext("2d");
const testtest = new Chart(cax, {
  // The type of chart we want to create
  type: "bar",

  // The data for our dataset
  data: {
    labels: [
      "밥요리",
      "국&탕",
      "찌개&전골",
      "볶음요리",
      "밑반찬",
      "찜&조림",
      "야식&술안주",
      "면요리",
      "샐러드",
      "김밥&초밥",
      "튀김",
      "스파게티",
      "간식&분식",
      "디저트",
      "구이",
      "토스트/샌드위치",
    ],
    datasets: [
      {
        label: "카테고리 별 조회수",
        backgroundColor: [
          "rgba(255, 99, 132, 0.5)",
          "rgba(54, 162, 235, 0.5)",
          "rgba(255, 206, 86, 0.5)",
          "rgba(75, 192, 192, 0.5)",
          "rgba(153, 102, 255, 0.5)",
          "rgba(255, 159, 64, 0.5)",
          "rgba(255, 159, 64, 0.5)",
          "rgba(255, 159, 64, 0.5)",
          "rgba(255, 159, 64, 0.5)",
          "rgba(255, 159, 64, 0.5)",
          "rgba(255, 159, 64, 0.5)",
        ],
        borderColor: [
          "rgb(255, 99, 132,1.5)",
          "rgba(54, 162, 235, 1.5)",
          "rgba(255, 206, 86, 1.5)",
          "rgba(75, 192, 192, 1.5)",
          "rgba(153, 102, 255, 1.5)",
          "rgba(255, 159, 64, 1.5)",
          "rgba(255, 159, 64, 1.5)",
          "rgba(255, 159, 64, 1.5)",
          "rgba(255, 159, 64, 1.5)",
          "rgba(255, 159, 64, 1.5)",
          "rgba(255, 159, 64, 1.5)",
          "rgba(255, 159, 64, 1.5)",
        ],

		// db에 있는 데이터 넣어야할  곳
        data: [
          238, 26, 408, 63, 5, 248, 38, 31, 0, 31, 1, 1, 32,
        ],
      },
    ],
  },

  // Configuration options go here
  options: {
    title: {
      display: true,
      fontColor: "rgba(46, 49, 49, 1)",
    },
    legend: {
      labels: {
        fontColor: "rgba(83, 51, 237, 1)",
        fontSize: 15,
      },
    },
    scales: {
      xAxes: [
        {
          ticks: {
            fontColor: "rgba(27, 163, 156, 1)",
            fontSize: "15",
          },
        },
      ],
      yAxes: [
        {
          ticks: {
            beginAtZero: true,
            fontColor: "rgba(246, 36, 89, 1)",
            fontSize: "15",
          },
        },
      ],
    },
  },
});

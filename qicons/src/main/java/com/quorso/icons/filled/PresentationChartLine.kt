package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.PresentationChartLine: ImageVector
    get() {
        if (_PresentationChartLine != null) {
            return _PresentationChartLine!!
        }
        _PresentationChartLine = ImageVector.Builder(
            name = "Filled.PresentationChartLine",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.25f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                lineTo(3f, 3.75f)
                verticalLineToRelative(10.5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineToRelative(1.21f)
                lineToRelative(-1.172f, 3.513f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.424f, 0.474f)
                lineToRelative(0.329f, -0.987f)
                horizontalLineToRelative(8.418f)
                lineToRelative(0.33f, 0.987f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.422f, -0.474f)
                lineToRelative(-1.17f, -3.513f)
                lineTo(18f, 17.25f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                lineTo(21f, 3.75f)
                horizontalLineToRelative(0.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                lineTo(2.25f, 2.25f)
                close()
                moveTo(8.79f, 17.25f)
                horizontalLineToRelative(6.42f)
                lineToRelative(0.5f, 1.5f)
                lineTo(8.29f, 18.75f)
                lineToRelative(0.5f, -1.5f)
                close()
                moveTo(16.875f, 8.255f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -0.75f, -1.299f)
                arcToRelative(12.81f, 12.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.558f, 3.05f)
                lineTo(11.03f, 8.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.06f, 0f)
                lineToRelative(-3f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.06f, 1.06f)
                lineToRelative(2.47f, -2.47f)
                lineToRelative(1.617f, 1.618f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.146f, -0.102f)
                arcToRelative(11.312f, 11.312f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.612f, -3.321f)
                close()
            }
        }.build()

        return _PresentationChartLine!!
    }

@Suppress("ObjectPropertyName")
private var _PresentationChartLine: ImageVector? = null

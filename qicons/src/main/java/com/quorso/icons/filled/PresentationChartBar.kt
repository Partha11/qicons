package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.PresentationChartBar: ImageVector
    get() {
        if (_PresentationChartBar != null) {
            return _PresentationChartBar!!
        }
        _PresentationChartBar = ImageVector.Builder(
            name = "Filled.PresentationChartBar",
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
                moveTo(8.29f, 18.75f)
                lineTo(8.79f, 17.25f)
                horizontalLineToRelative(6.42f)
                lineToRelative(0.5f, 1.5f)
                lineTo(8.29f, 18.75f)
                close()
                moveTo(15.75f, 6.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(6f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                verticalLineToRelative(-6f)
                close()
                moveTo(12.75f, 9f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(3.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                lineTo(12.75f, 9f)
                close()
                moveTo(9.75f, 11.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                verticalLineToRelative(-1.5f)
                close()
            }
        }.build()

        return _PresentationChartBar!!
    }

@Suppress("ObjectPropertyName")
private var _PresentationChartBar: ImageVector? = null

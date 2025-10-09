package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.TableCells: ImageVector
    get() {
        if (_TableCells != null) {
            return _TableCells!!
        }
        _TableCells = ImageVector.Builder(
            name = "Filled.TableCells",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1.5f, 5.625f)
                curveToRelative(0f, -1.036f, 0.84f, -1.875f, 1.875f, -1.875f)
                horizontalLineToRelative(17.25f)
                curveToRelative(1.035f, 0f, 1.875f, 0.84f, 1.875f, 1.875f)
                verticalLineToRelative(12.75f)
                curveToRelative(0f, 1.035f, -0.84f, 1.875f, -1.875f, 1.875f)
                lineTo(3.375f, 20.25f)
                arcTo(1.875f, 1.875f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 18.375f)
                lineTo(1.5f, 5.625f)
                close()
                moveTo(21f, 9.375f)
                arcTo(0.375f, 0.375f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.625f, 9f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.375f, 0.375f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.207f, 0.168f, 0.375f, 0.375f, 0.375f)
                horizontalLineToRelative(7.5f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.375f, -0.375f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(21f, 13.125f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.375f, -0.375f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.375f, 0.375f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.207f, 0.168f, 0.375f, 0.375f, 0.375f)
                horizontalLineToRelative(7.5f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.375f, -0.375f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(21f, 16.875f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.375f, -0.375f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.375f, 0.375f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.207f, 0.168f, 0.375f, 0.375f, 0.375f)
                horizontalLineToRelative(7.5f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.375f, -0.375f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(10.875f, 18.75f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.375f, -0.375f)
                verticalLineToRelative(-1.5f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.375f, -0.375f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.375f, 0.375f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.207f, 0.168f, 0.375f, 0.375f, 0.375f)
                horizontalLineToRelative(7.5f)
                close()
                moveTo(3.375f, 15f)
                horizontalLineToRelative(7.5f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.375f, -0.375f)
                verticalLineToRelative(-1.5f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.375f, -0.375f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.375f, 0.375f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.207f, 0.168f, 0.375f, 0.375f, 0.375f)
                close()
                moveTo(3.375f, 11.25f)
                horizontalLineToRelative(7.5f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.375f, -0.375f)
                verticalLineToRelative(-1.5f)
                arcTo(0.375f, 0.375f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.875f, 9f)
                horizontalLineToRelative(-7.5f)
                arcTo(0.375f, 0.375f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 9.375f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.207f, 0.168f, 0.375f, 0.375f, 0.375f)
                close()
            }
        }.build()

        return _TableCells!!
    }

@Suppress("ObjectPropertyName")
private var _TableCells: ImageVector? = null
